package samples.codingTasks.findDublicate;

import java.util.HashSet;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 2, 5, 1};
        findDublicate(arr).ifPresent(System.out::println);
    }

    public static OptionalInt findDublicate(int[] arr) {
        HashSet<Integer> mayBeDuplicates = new HashSet<>(arr.length, 1.0f);
        for (int elem : arr) {
            if (mayBeDuplicates.contains(elem)) {
                return OptionalInt.of(elem);
            }
            mayBeDuplicates.add(elem);
        }
        return OptionalInt.empty();
    }

}
