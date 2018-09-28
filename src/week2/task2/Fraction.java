package week2.task2;

import static week2.task1.Task1.gcd;


public class Fraction {
   private int numerator, denomirator;
   
// getter. setter
   
   public int getNumertor(){
       return this.numerator;
   }
   public void setNummertor(int a){
       this.numerator = a;
   }
   public int getDenomirator(){
       return this.denomirator;
   }
   public void setDenomirator(int a){
       this.denomirator = a;
   }
   public String displayFraction(){
       return this.numerator + "/" + this.denomirator;
   }

   
    private void reduce(){ 
        // rút gọn phân số
        if(denomirator < 0){
            denomirator = -denomirator;
            numerator = -numerator;
        }
        // lấy ước chung tử mẫu
        int uc = numerator >= 0? gcd(numerator, denomirator):gcd(-numerator, denomirator);
        
        //Rút gọn
        this.numerator /= uc;
        this.denomirator /= uc;        
    }
//hàm khởi tạo
    Fraction(int numerator_, int denominator_) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        if(denominator_ == 0 ) System.out.println("Khởi tạo thất bại(mẫu số  ==  0)");
        else{
            this.numerator = numerator_;
            this.denomirator = denominator_;
            this.reduce();
        }
    } 

// các phép toán với phân số
    
    /**
     *
     * @param other
     * @return
     */
    public Fraction add(Fraction other) {
        //TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.numerator * other.denomirator + this.denomirator * other.numerator , this.denomirator * other.denomirator);   
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
                return new Fraction(this.numerator * other.denomirator - this.denomirator * other.numerator, this.denomirator * other.denomirator);
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        return new Fraction(this.numerator * other.numerator, this.denomirator*other.denomirator);
        
        
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(this.numerator * other.denomirator, this.denomirator*other.numerator);
        return a;
    }
    
    public boolean equals(Object obj){
        if(obj instanceof Fraction){
        Fraction other = (Fraction) obj;
        return (this.numerator == other.numerator && this.denomirator == other.denomirator);
        
        }
        
        else return false;
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 3);
        Fraction b = new Fraction(2, 3);
        
        if(a.equals(b)) System.out.println("hai phan so bang nhau");
        else System.out.println("hai phan so khac nhau");
        
        System.out.print("tong hai phan so là: ");
        System.out.println(a.add(b).displayFraction());
        System.out.print("hieu hai phan so la: ");
        System.out.println(a.subtract(b).displayFraction());
        System.out.print("tich hai phan so la: ");
        System.out.println(a.multiply(b).displayFraction());
        System.out.print("thuong hai phan so: ");
        System.out.println(a.divide(b).displayFraction());
        
        
    }
  
}
