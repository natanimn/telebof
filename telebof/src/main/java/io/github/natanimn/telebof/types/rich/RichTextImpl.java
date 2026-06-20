package io.github.natanimn.telebof.types.rich;

public class RichTextImpl implements RichText {
    private final String type;
    private final String text;

    public RichTextImpl(String text, String type){
        this.type = type;
        this.text = text;
    }
}
