package samples.values;

public class Maximum {

    private final int[] arr;
    private int max;

    public Maximum(int[] arr) {
        this.arr = arr;
    }

    public int getMaximum() {
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

}
