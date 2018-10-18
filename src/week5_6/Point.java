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
public class Point {
    private double x;
    private double y;

    /**
     * constuctor
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    

    /**
     * getter/stter
     * @return
     */
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    

    /**
     * Ghi đè phương thức toString
     * @return
     */
    public String toString(){
        return( "( "+ x +  ";" + y + " )");
    }
    @Override
    public boolean equals(Object object){
        if(object instanceof Point){
            Point p = (Point)object;
            return(x == p.x && y == p.y);
        }
        else return false;
    }
}
