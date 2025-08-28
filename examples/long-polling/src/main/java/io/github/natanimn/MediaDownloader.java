package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.types.keyboard.ReplyParameters;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.updates.Update;
import java.io.FileOutputStream;
import java.io.File;
import java.util.Arrays;

class IsValidCommand implements CustomFilter{
    @Override
    public boolean check(Update update) {
        var text = update.message.text;
        if (!text.startsWith("/")) return false;

        var params = text.split("_");

        if (params.length == 1) return false;

        var prefix = params[0];
        var commands = new String[]{"/photo", "/video", "/gif", "/audio"};

        return Arrays.stream(commands).toList().contains(prefix);

    }
}


public class MediaDownloader {
    private BotClient bot;

    public MediaDownloader(String token){
        this.bot = new BotClient.Builder(token).numThreads(10).build();
        var isValidCommand = new IsValidCommand();
        bot.onMessage(filter -> filter.commands("start"), this::start);
        bot.onMessage(filter -> filter.photo() || filter.audio() || filter.animation() || filter.video() ||
                filter.video(), this::downloadMedia);
        bot.onMessage(filter -> filter.text() && filter.customFilter(isValidCommand), this::getMedia);
    }

    private void start(BotContext context, Message message){
        context.sendMessage(message.chat.id,
                """
                        Welcome!
                        
                        I am media downloader bot. Send me photo, video, audio or gif up to 20MB; \
                        I will download it into my machine, and you will get it back with special command"""
        ).exec();
    }

    private void downloadMedia(BotContext context, Message message) {
        
        var msg = context.sendMessage(message.chat.id, "<code>Downloading media...</code>")
                .replyParameters(new ReplyParameters(message.message_id))
                .parseMode(ParseMode.HTML)
                .exec();

        String file_id, type, ext;
        
        if (message.photo != null) {
            file_id = message.photo.getLast().file_id; // Best quantity
            type    = "photo";
            ext     = ".png";
        } else if (message.audio != null) {
            file_id = message.audio.file_id;
            type    = "audio";
            ext     = ".mp3";
        } else if (message.video != null) {
            file_id = message.video.file_id;
            type    = "video";
            ext     = ".mp4";
        } else {
            file_id = message.animation.file_id;
            type = "gif";
            ext = ".gif";
        }
        var file    = context.getFile(file_id).exec(); // Get information of the file
        var data    = context.downloadFile(file.file_path); // Special method used for downloading files from https://api.telegram.org/file/bot<token>/<file_path>

        try(var stream  = new FileOutputStream(file_id + ext)){
            stream.write(data);
            context.editMessageText("<b>Media downloaded successfully!</b>", message.chat.id, msg.message_id)
                    .parseMode(ParseMode.HTML)
                    .exec();
            context.sendMessage(message.chat.id, String.format("Send <code>/%s_%s</code> to get the media back", type, file_id))
                    .parseMode(ParseMode.HTML)
                    .exec();
        } catch (Exception e) {
            context.editMessageText("An error occurred:\n\n" + e.getMessage(), message.chat.id, msg.message_id).exec();
        }
    }

    private void getMedia(BotContext context, Message message) {
        var param = message.text.split("_");
        var type = param[0].replace("/", "");
        var file_id = String.join("_", Arrays.copyOfRange(param, 1, param.length));
        var chat_id = message.chat.id;

        File file = switch (type){
            case "photo" -> new File( file_id + ".png");
            case "video" -> new File( file_id + ".mp4");
            case "gif" -> new File( file_id + ".gif");
            default -> new File( file_id + ".mp3");
        };

        if (file.exists()){
            switch (type){
                case "photo":
                    context.sendPhoto(chat_id, file).exec();
                    break;
                case "video":
                    context.sendVideo(chat_id, file).exec();
                    break;
                case "gif":
                    context.sendAnimation(chat_id, file).exec();
                    break;
                default:
                    context.sendAudio(chat_id, file).exec();
                    break;
            }
        } else context.sendMessage(chat_id, "Media not found").exec();

    }

    public void runBot(){
        bot.startPolling();
    }

    public static void main(String[] args){
        final var TOKEN = System.getenv("TOKEN");
        final var downloader = new MediaDownloader(TOKEN);
        downloader.runBot();
    }
}
