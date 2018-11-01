/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author thinhnguyen
 */
public class Subtraction extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }

   
}
