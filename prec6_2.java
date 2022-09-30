// Name :-Param Thumar
// Roll-no :-21ce144
import java.util.Random;

public class prec6_2 {public static void main(String[] args) {
    Random rand = new Random();
    int[] arr = new int[15];
    for (int j = 0; j < arr.length; j++) {
        arr[j] = rand.nextInt(100);
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.println("Index" + i + " = " + arr[i]);
    }
    odd O = new odd(arr);
    even E = new even(arr);
}
}