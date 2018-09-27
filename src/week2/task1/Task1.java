package week2.task1;

public class Task1 {

    public static int gcd(int m, int n) {
        // TODO: Tính ước chung lớn nhất của 2 số m, n
        if(m<n){
        if(m==0) return n;
        else return gcd(n%m,m);
    }
    else
    if(n==0) return m;
    else return gcd(m%n,n);
       
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
}
