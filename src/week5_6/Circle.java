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
public class Circle extends Shape{
    private Point a;
    private double radius;
    private final double PI = Math.PI;

    /**
     * constructor
     */


    public Circle(Point a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Circle(String color, boolean filled, Point a, double radius) {
        super(color, filled);
        this.a = a;
        this.radius = radius;
    }

       public Circle(){
        radius = 1.0;
        a = new Point(1,1);
    }

    

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * getter/setter
      */

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }


    /**
     * Ghi đè phương thức toString
      */

    @Override
    public String toString() {
        return "Hình tròn có bán kính là: " + this.getRadius()
                + " \t Tâm là:  " + a ;
    }
    @Override
    public boolean equals(Object object){
        if(object instanceof  Circle){
            
            return(a.equals(((Circle) object).a) 
                    && radius == ((Circle) object).radius);
        }
        else return false;
    }
}
