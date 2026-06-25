package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;

/**
 * A mathematical expression.
 * @author Natanim
 * @since 2.1
 */
public class RichTextMathematicalExpression implements RichText {
    /**
     * Type of the rich text, always “mathematical_expression”
     */
    private final String type = "mathematical_expression";

    /**
     * The expression in LaTeX format
     */
    private final String expression;

    public RichTextMathematicalExpression(String expression){
        this.expression = expression;
    }
}
