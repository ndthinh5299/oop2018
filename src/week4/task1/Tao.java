/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author thinhnguyen
 */
public class Tao extends HoaQua{
    private int giaBan;
    private String canNang;

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String getCanNang() {
        return canNang;
    }

    public void setCanNang(String canNang) {
        this.canNang = canNang;
    }
    
    public void chungLoai(){
        System.out.println("Tao Trung Quoc");
    }
    public void thiTruong(){
        System.out.println("Mien Bac Viet Nam");
    }
    
}
