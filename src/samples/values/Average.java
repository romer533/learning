package samples.values;

public class Average {

    private final int[] arr;
    private int sum;

    public Average(int[] arr) {
        this.arr = arr;
    }

    public int getAverage() {
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

}
