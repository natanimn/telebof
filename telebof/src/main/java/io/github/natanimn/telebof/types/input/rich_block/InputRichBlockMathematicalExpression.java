package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A block with a mathematical expression in LaTeX format, corresponding to the custom HTML tag <tg-math-block>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockMathematicalExpression implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "mathematical_expression";

    private final String expression;

    /**
     * Required
     * @param expression The mathematical expression in LaTeX format
     */
    public InputRichBlockMathematicalExpression(String expression){
        this.expression = expression;
    }
}
