//Count distinct elements from the list. (distinct → count)

import java.util.*;

class StreamCountDistinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 22, 22, 40, 55, 60, 70, 80, 5, 12);

        long count = list.stream()
                         .distinct()
                         .count();

        System.out.println(count);
    }
}
