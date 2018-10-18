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
public class Hexagon extends Shape{
    private Point centerPoint;
    private double side; //khoang cach tu tam den dinh

    public Hexagon(String color, boolean filled, Point centerPoint, double side) {
        super(color, filled);
        this.centerPoint = centerPoint;
        this.side = side;
    }

    public Hexagon(Point centerPoint, double side) {
        this.centerPoint = centerPoint;
        this.side = side;
    }

    public Hexagon() {
        this.side = 1.0;
        this.centerPoint = new Point(0,0);
    }

    public Hexagon(String color, boolean filled) {
        this();
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "centerPoint=" + centerPoint +
                ", side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Hexagon){
            return (centerPoint.equals(((Hexagon) o).centerPoint)
                    && side == ((Hexagon) o).side);
        }
        else return false;
    }
}
