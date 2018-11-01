package week7.task1;

public class Addition extends BinaryExpression{
    private Expression left;
    private Expression right;

   

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
   
    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
