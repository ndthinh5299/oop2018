package week2.task3;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("week2.task3.Task3.main()");
    }
}
class Hocsinh{
    private String name;
    private int tuoi;
    private String diaChi;
    public void setName(String name_){
       name = name_;
    } 
    public String getName(){
        return name;
    }
    public void setTuoi(int tuoi_){
        tuoi = tuoi_;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setDiaChi(String diachi_){
        diaChi = diachi_;
    }
    public String getDiaChi(){
        return diaChi;
    }
    public void TheDuc(){
        System.out.println("dien kinh");
    }
    public void Ketqua(int diem ){
        if(diem > 5) System.out.println("do");
        else System.out.println("truot");
    }
    public void dimuon(){
        System.out.println("di muon roi");
    }
    
   
}
 class cho{
    private String ten;
    private String maulong;
    private String chungloai;
    public void setName(String name){
        ten= name;
    }
    public String getName(){
        return ten;
    }
    public void setMaulong(String a){
        maulong = a;
    }
    public String getmaulong(){
        return maulong;
    }
    public void setChungloai(String a){
        chungloai = a;
    }
    public String getChungloai(){
        return chungloai;
    }
    public void sua(){
        System.out.println("gau gau gau");
    }
    public void ngu(){
        System.out.println("khut khit");
    }
    public void an(){
        System.out.println("an xuong");
    }
    
    
    
}
class hinhhop{
    private int chieudai, chieurong, chieucao;
    public int getChieudai(){
        return chieudai;
    }
    public void setChieudai(int a){
        chieudai = a;
    }
    public int getChieuRong(){
        return chieurong;
    }
    public void setChieuRong(int a){
        chieurong = a;
    }
    public void setChieucao(int a){
        chieucao = a;
    }
    public int getChieucao(){
        return chieucao;
    }
    public int Thetich(){
        return chieudai*chieurong*chieucao;
    }
    public  int dientichday(){
        return chieudai*chieurong;
    }
    public int dientichmat(){
        return chieudai*chieucao;
    }
    

}
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
