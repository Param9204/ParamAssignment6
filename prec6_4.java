// Name :-Param Thumar
// Roll-no :-21ce144
import java.lang.*;
public class prec6_4 extends Thread {
    public void run() {
        System.out.println("Inside run method");
    }
    public static void main(String[] args) {
        prec6_4 FIRST = new prec6_4();
        prec6_4 SECOND = new prec6_4();
        prec6_4 THIRD = new prec6_4();
        System.out.println("First thread priority : " + FIRST.getPriority());
        System.out.println("Second thread priority : " + SECOND.getPriority());
        System.out.println("Third thread priority : " + THIRD.getPriority());
        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);
        System.out.println("\nFirst thread priority : " + FIRST.getPriority());
        System.out.println("Second thread priority : " + SECOND.getPriority());
        System.out.println("Third thread priority : " + THIRD.getPriority());
    }
}