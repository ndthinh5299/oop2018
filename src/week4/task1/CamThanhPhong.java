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
public class CamThanhPhong extends Cam{
    private String IdCam;
    private String giaBan;

    public String getIdCam() {
        return IdCam;
    }

    public void setIdCam(String IdCam) {
        this.IdCam = IdCam;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }
    
    public void tenRieng(){
        System.out.println("Cam Thanh Phong");
    }
    public void Khuyenmai(){
        System.out.println("khuyen mai 20% voi khach hang VIP");
    }
}
