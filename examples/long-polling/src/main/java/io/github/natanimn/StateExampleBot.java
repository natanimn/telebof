package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.updates.Message;

public class StateExampleBot {

    BotClient bot;
    public StateExampleBot(String token){
        bot = new BotClient(token);
        bot.onMessage(filter -> filter.commands("start"), this::start);
        bot.onMessage(filter -> filter.commands("cancel") && filter.state("*"), this::cancel);
        bot.onMessage(filter -> filter.state("name"), this::getName);
        bot.onMessage(filter -> filter.state("age"), this::getAge);
    }

    private void start(BotContext ctx, Message message){
        ctx.sendMessage(message.from.id, "Hey! What is your name?").exec();
        ctx.setState(message.from.id, "name");
    }

    private void getName(BotContext ctx, Message message){
        ctx.sendMessage(message.from.id, "How old are you?").exec();
        ctx.setState(message.from.id, "age");
        var data = ctx.getStateData(message.from.id);
        data.put("name", message.text);
    }

    private void getAge(BotContext ctx, Message message){
        int age;
        try{
            age = Integer.parseInt(message.text);
        } catch (NumberFormatException e) {
            ctx.sendMessage(message.from.id, "Please enter valid number").exec();
            return;
        }
        var data = ctx.getStateData(message.from.id);
        ctx.sendMessage(message.from.id, "Thank you for the information you have given.").exec();

        ctx.sendMessage(message.from.id, String.format("<b>Name:</b> %s\n<b>Age: </b> %d", data.get("name"), age))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    private void cancel(BotContext ctx, Message message){
        // Clear existing state
        ctx.clearState(message.from.id);
        ctx.sendMessage(message.from.id, "Your information has been cleared. Type /start to begin again.").exec();
    }

    public void run(){
        bot.startPolling();
    }
    public static void main(String[] args){
        var token = System.getenv("TOKEN");

        var state_bot = new StateExampleBot(token);

        state_bot.run();
    }
}
