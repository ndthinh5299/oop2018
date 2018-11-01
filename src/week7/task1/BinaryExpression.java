package week7.task1;

public class BinaryExpression extends Expression {
    public  Expression left(){
        return this.left();
    }
    public Expression right(){
       return this.right();
    }

    @Override
    public int evaluate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
