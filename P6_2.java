// Name :-Param Thumar
// Roll-no :-21ce144
class odd extends Thread {
    int[] array;
    odd(int[] array) {
        this.array = array;
        start();
    }
    public void run() {
        System.out.println("odd :-");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 1) {
                System.out.println(array[j]);
            }
        }
    }
}
class even extends Thread {
    int[] array;
    even(int[] array) {
        this.array = array;
        start();
    }
    public void run() {
        System.out.println("Even :-");
        for (int j = 0; j < array.length; j++) {
            if (j % 2 == 0) {
                System.out.println(array[j]);
            }
        }
    }
}
