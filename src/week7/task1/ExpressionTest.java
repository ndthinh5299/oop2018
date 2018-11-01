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
public class ExpressionTest {
    public static void main(String[] args) {
        Expression e1 = new Numeral(10); //10
        Expression e2 = new Numeral(1); //1
        Expression e3 = new Numeral(2); //2
        Expression e4 = new Numeral(3); //3
        Expression e5 = new Square(e1); //10^2
        Expression e6 = new Subtraction(e5, e2); //10^2 - 1
        Expression e7 = new Multiplication(e3, e4); //2*3
        Expression e8 = new Addition(e6, e7); //10^2 - 1 + 2*3
        Expression e = new Square(e8); //(10^2 - 1 + 2*3)^2
        System.out.println(e.evaluate());
        Expression e9 = new Numeral(1999);
        Expression e10 = new Numeral(0);
        try{
            int i = 10/0;
            System.out.println(i);
        }catch(ArithmeticException ae){
            System.out.println(" Loi Chia cho so 0");
        }
    }
}
