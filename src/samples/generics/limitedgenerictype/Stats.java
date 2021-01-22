package samples.generics.limitedgenerictype;

// Аргумент типа T должен быть классом Number
// или наследуемым от него классом
public class Stats<T extends Number> {

    private T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (T num : nums) sum += num.doubleValue();
        return sum / nums.length;
    }

}
