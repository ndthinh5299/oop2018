/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * chương trình tính chu vi và diện tích của hình chữ nhật
 * class Rectangle kế thừa từ class Shape
 * @author thinhnguyen
 * @version 0.0
 * @since 1900
 */
public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
/**
 * đây là phương thức khởi tao không tham số
 */
    public Rectangle() {}
/**
 * đây là phương thức khởi tao có tham số 
 * @param width_ chiều rộng hcn muốn khởi tao
 * @param length_ chiều dài hình chữ nhật muốn khởi tạo
 * @param color_ màu sắc hình chữ nhật muốn khởi tạo
 * @param filled_ tình trạng filled hình chữ nhật muốn khởi tao
 */
    public Rectangle(double width_, double length_, String color_, boolean  filled_){
        this.width=width_;
        this.color = color_;
        this.length= length_;
        this.filled = filled_;
    }
/**
 * getter phương thức Width
 * @return double chiều rộng của hình chữ nhật
 */
    public double getWidth() {
        return width;
    }
/**
 * setter thuộc tính Width
 * @param width chiều rộng muốn cái đặt
 */
    public void setWidth(double width) {
        this.width = width;
    }
/**
 * getter chiều dài của hình chữ nhật
 * @return double chiều dài của hình chữ nhật
 */
    public double getLength() {
        return length;
    }
/**
 * setter chiều dài hình chữ nhật
 * @param length double chiều dài của hình chữ nhật 
 */
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 3, "Red", true);
        System.out.println("chu vi: " + r.getPerimeter());
        System.out.println("Dien tich: " + r.getArea());
        
    }
    
}
