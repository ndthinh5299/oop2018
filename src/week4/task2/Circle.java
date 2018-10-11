/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * Chương trình tính toán chu vi và diện tích của hình tròn 
 * class Circle kế thừa từ class Shape
 * @author thinhnguyen
 * @version 0.0
 * @since 30/4/1975
 */
public class Circle extends Shape{
    private final double PI = 3.14;
    private double radius ;
/**
 * đây là phương thức khởi tạo ko tham số
 */
    public Circle() {
        this.radius = 1.0;
    }
/**
 * đây là phương thức khởi tạo có tham số
 * @param radius_ đây là tham số thứ nhất, là bán kính muốn khởi tạo 
 * @param color_ đây là tham số thứ hai, là màu sắc muốn khởi tạo
 * @param filled_ đây là thamso thứ ba, là tình trạng fill muốn khởi tao
 */    
    public Circle(double radius_, String color_, boolean filled_){
        this.filled = filled_;
        this.radius = radius_;
        this.color = color_;
    } 
/**
 * đây là getter thuộc tính Radius
 * @return double bán kính của hình tròn
 */
    public double getRadius() {
        return radius;
    }
/**
 * seter thuộc tính radius
 * @param radius tham số truyền vào là bán kình muốn cài dặt
 */
    public void setRadius(double radius) {
        this.radius = radius;
    }
/**
 * phương thức này tính toán diện thích là hình tròn
 * @return double diện tích của hình tròn (số PI tự định nghĩa)
 */
    public double getArea(){
        return PI * radius * radius ;
    }
/**
 * phương thức này tính toán chu vi của hình tròn
 * @return  double chu vi của hình tròn (sô PI tự định nghĩa)
 */
    public double getPerimeter(){
        return 2 * PI * radius;
    }
    @Override 
    public String toString(){
    return "{" + radius + "}";
}
}
