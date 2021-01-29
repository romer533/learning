package samples.values;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = createRandomArray();

        Maximum max = new Maximum(arr);
        Minimum min = new Minimum(arr);
        Average average = new Average(arr);

        System.out.println("max = " + max.getMaximum());
        System.out.println("min = " + min.getMinimum());
        System.out.println("average = " + average.getAverage());

    }

    private static int[] createRandomArray() {
        Random rnd = new Random();
        int x = rnd.nextInt(50);

        int[] arr = new int[x];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100) - 50;
        }
        return arr;
    }

}
