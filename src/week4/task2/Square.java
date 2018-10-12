/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * class Square kế thừa từ class Rectange
 * mô tả các thuộc tính và phương thức của Hình Vuông 
 * @author thinhnguyen
 * @version 0.0
 * @since 1975
 */
public class Square extends Rectangle{
    
    public Square(){
        super();
    }
/**
 * phương thức khởi tạo 1 tham số
 * @param side_ cạnh hình vuông muốn cài đặt
 */    
    public Square(double side_){
        super(side_, side_);
    }   
/**
 * phương thức khởi tao 3 tham số
 * @param side_ cạnh hình vuông muốn khởi tao
 * @param color_ màu sắc hình vuông muốn khởi tao
 * @param filled_ tình trạng filled 
 */
    public Square(double side_, String color_, boolean filled_ ){
        super(side_, side_);
        this.color = color_;
        this.filled = filled_;
    }
/**
 * getter của thuộc tính side
 * @return double cạnh của hình vuông
 */
    public double getSide() {
        return super.getLength();
    }
/**
 * setter thuộc tính side
 * @param side tham số là cạnh góc vuông muốn truyền vào
 */
    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }
/**
 * phương thức ghi đè từ lớp cha
 * 
 * @param side chiều rộng hình chữ nhật(ở đây đồng thời là cạnh hình vuông) 
 */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }
/**
 * phương thức ghi đè từ lớp cha
 * @param side chiều dài hình chữ nhật (ở đây đồng thời là cạnh hình vuông)
 */
    @Override
    public void setLength(double side) {
        setSide(side);
    }
    @Override
    public String toString(){
        return "{" + super.getWidth() + "}";
    }
}
