package week7.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public void a() throws NullPointerException{
         throw  new NullPointerException();
    }
    public void b() throws ArrayIndexOutOfBoundsException{
       throw new ArrayIndexOutOfBoundsException();
    }
    public int c(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException();
        else return a/b;
    }
    public void d(int a) throws IOException{
        if(a ==0 ) throw  new IOException();
        else System.out.println(a);
    }
    public void e() throws FileNotFoundException{
            throw new FileNotFoundException();
            }
    public void f() throws ClassCastException{
        throw new ClassCastException();
    }
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        try {
            task2.a();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        try {
            task2.b();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
