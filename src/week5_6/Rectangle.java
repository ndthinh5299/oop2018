/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import week5_6.Point;

/**
 *
 * @author thinhnguyen
 */
public class Rectangle extends Shape{
    private Point a,b,c,d;

    /**
     * constuctor
     */
    public Rectangle() {
        a = new Point(0,0);
        b = new Point(0,1);
        c= new Point(1,1);
        d = new Point(1,0);
    }
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Rectangle(String color, boolean filled, Point a, Point b, Point c, Point d) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }
    /**
     * Phương thức di chuyển hình chữ nhật
     */
    

    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return  "Hình chữ nhật: " + a+ b+ c+ d
                + "\t màu sắc: "  + super.getColor();

    }
    @Override
    public boolean equals(Object object){
        if(object instanceof Rectangle){
        Rectangle r =(Rectangle)object;
        return (a.equals(r.a) && b.equals(r.b) && c.equals(r.c)
                && d.equals(r.d)) ;
        }
        else return false;
    }
}
