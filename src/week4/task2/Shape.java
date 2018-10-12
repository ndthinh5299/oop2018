/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 * Bai tap tuan 4 
 * @author thinhnguyen
 * @since 2018-09-10
 */
public class Shape {
    protected String color;
    protected boolean filled ;
    /**
     * phương thức khởi tạo không có tham số
     */
    public Shape(){
        color = "red";
        filled = true;
    }
    /**
     * phương thưc khởi tao có tham số
     * @param color_ đây la tham số đầu tiên 
     * @param filled_ đây là tham số thứ hai
     */
    public Shape(String color_, boolean filled_){
        this.color = color_;
        this.filled = filled_;
    }
    /**
     * đây là getter của thuộc tính Color
     * @return String Tra ve màu sắc 
     */
    public String getColor() {
        return color;
    }
    /**
     * đây là setter thuộc tính color 
     * 
     * @param color String màu sắc muốn cài đặt
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Đây là getter thuộc tính Filled
     * @return boolean trả về trạng thái fill
     */
    public boolean isFilled() {
        return filled;
    }
    /**
     * Đây là setter thuộc tính Filled 
     *@param filled đây là trạng thái cần cài đặt 
    */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //ghi đè phương thức
    @Override
    public String toString(){
        String fill = filled? "filled" : "not filled";
        return "{" + this.color + "," + fill + "}";
    }
}
    
