/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * class CamSanh thừa kế từ class Cam mô tả các thuộc tính và phương thức của Cam Sành
 * @author thinhnguyen
 * @version 0.0
 * @since 10/9/2018 10:00
 */
public class CamSanh extends Cam{
    private String IdCam ;
    private String giaBan;
/**
 * đây là setter thuộc tính idCam
 * @return String IdCam là mã số của quả Cam
 */
    public String getIdCam() {
        return IdCam;
    }
/**
 * đây là setter của thuộc tính idCam
 * @param IdCam là String mã số muốn setting cho quả cam Sành
 */
    public void setIdCam(String IdCam) {
        this.IdCam = IdCam;
    }
/**
 * đây là getter thuộc tính giaBan của CamSanh 
 * @return String giá bán của cam Sành
 */
    public String getGiaBan() {
        return giaBan;
    }
/**
 * đây là setter giá bán của cam Sành
 * @param giaBan là giá bán cam sành bạn muốn thiết lập
 */
    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }
/**
 * phương thức này in ra tên riêng của quả cam sành
 */
     public void tenRieng(){
        System.out.println("Cam Sanh");
    }
/**
 * đây là phương thức in ra chương trình khuyến mãi của Cam Sành
 */     
    public void Khuyenmai(){
        System.out.println("khuyen mai 100% voi khach hang ten Thinh");
    }
    
}
