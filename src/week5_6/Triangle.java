/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import week5_6.Shape;
import week5_6.Point;

/**
 *
 * @author thinhnguyen
 */
public class Triangle extends Shape {
    private Point a,b,c;

    /**
     * constuctor
     */
    public Triangle(){
        a = new Point(1,0);
        b = new Point(2,0);
        c = new Point(4,5);
        
    }
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, boolean filled, Point a, Point b, Point c) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * getter/setter
     * @return
     */
    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }


    public void setC(Point c) {
        this.c = c;
    }
   
    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return "Hình tam giác có 3 đỉnh: " + a+ b +c
                +"\t Màu sắc: " + super.getColor();
    }
    @Override
    public boolean equals(Object object){
        if(object instanceof  Triangle){
            return(a.equals(((Triangle) object).a)
                && b.equals(((Triangle) object).b)
                && c.equals(((Triangle) object).c)
                    );
        }
        else return false;
    }
}
