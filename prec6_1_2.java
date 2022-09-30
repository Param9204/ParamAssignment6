// Name :-Param Thumar
// Roll-no :-21ce144
public class prec6_1_2 implements Runnable {
    public void run() {
        System.out.println("\tWorld");
    }
    public static void main(String[] args) {
        prec6_1_2 t1 = new prec6_1_2();
        Thread t = new Thread(t1);
        t.start();
        System.out.println("Hello");
    }
}