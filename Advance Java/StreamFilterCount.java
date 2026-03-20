//Count how many numbers are greater than 50. (filter → count)

import java.util.*;

class StreamFilterCount {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 22, 33, 40, 55, 60, 70, 80, 5, 12);

        long count = list.stream()
                         .filter(x -> x > 50)
                         .count();

        System.out.println(count);
    }
}
