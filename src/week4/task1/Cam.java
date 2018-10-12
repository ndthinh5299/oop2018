/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * Class Cam kế thừa từ class cha HoaQua
 * @author thinhnguyen
 */
public class Cam extends HoaQua{
    protected String mauSac ;
    protected String tinhTrang;
    /**
     * đây là getter thuộc tính mauSac
     * @return String là màu sắc của quả Cam
     */
    public String getMauSac() {
        return mauSac;
    }
/**
 * đây là setter thuộc tính mauSac
 * @param mauSac màu sắc bạn muốn cài đặt cho quả cam
 */
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
/**
 * đây là getter thuộc tính tinhTrang của Cam
 * @return String tinhTrang của quả Cam
 */
    public String getTinhTrang() {
        return tinhTrang;
    }
/**
 * đây là setter thuộc tính tinhTrang
 * @param tinhTrang là tình trạng qua cam bạn muốn cài đặt
 */
    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
/**
 * đây là phương thức in ra thị trường tiêu thụ của quả cam
 */
    
    public void thiTruong(){
        System.out.println("Thi truong Trung Quoc");
    }
/**
 * đây là phương thức in ra đối tượng khách hàng của quả cam
 */
    public void khachHang(){
        System.out.println("nhung ng thich an hoa qua dac biet la cam");
    }
    
}
