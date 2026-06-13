package io.github.natanimn.telebof.types.rich;

public class RichTextImpl implements RichText {
    private final String type;
    private final String text;

    public RichTextImpl(String type, String text){
        this.type = type;
        this.text = text;
    }
}
