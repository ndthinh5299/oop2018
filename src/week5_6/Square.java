/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author thinhnguyen
 */
public class Square extends Rectangle {
    public Square(){
        super(new Point(1, 1),new Point(1, 1),new Point(1, 1),new Point(1, 1) );
    }

    public Square(Point a, Point b, Point c, Point d) {
        super(a, b, c, d);
    }

    /**
     * constuctor
     */
    public Square(String color, boolean filled, Point a, Point b, Point c, Point d) {
        super(color, filled, a, b, c, d);
    }

    /**
     * Ghi đè phương thức toString
     */
    
    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return "Hinnfh vuông có 4 đỉnh là: " + super.getA() + super.getB() + super.getC() + super.getD()
                + "\t Màu sắc là: " + super.getColor();
    }
}
