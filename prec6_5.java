// Name :-Param Thumar
// Roll-no :-21ce144
public class prec6_5 {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();
    }
}