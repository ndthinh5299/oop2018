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
public class Shape {
    private String Color;
    private boolean Filled;

    /**
     * constuctor
     */
    public Shape(){
        this.Color = "red";
        this.Filled = true;
    }
    public Shape(String color, boolean filled){
        this.Color = color;
        this.Filled = filled;
    }

    /**
     *  getter/setter
      */

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public boolean isFilled() {
        return Filled;
    }

    public void setFilled(boolean filled) {
        this.Filled = filled;
    }

    /**
     *  Ghi đè phương thức toString
      */


    public String toString(){
        return "hình có màu: " + this.getColor();
    }

}
