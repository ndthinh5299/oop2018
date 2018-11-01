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
public class Division extends BinaryExpression{
    private Expression left;
    private Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
     public int evaluate() {
        return left.evaluate()/right.evaluate();
    }
}
