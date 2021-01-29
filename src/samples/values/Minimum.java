package samples.values;

public class Minimum {

    private final int[] arr;
    private int min;

    public Minimum(int[] arr) {
        this.arr = arr;
    }

    public int getMinimum() {
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

}
