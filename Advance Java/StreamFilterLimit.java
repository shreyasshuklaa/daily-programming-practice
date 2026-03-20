//Print only the first 5 even numbers from the list.

import java.util.*;

class StreamFilterLimit {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 22, 33, 40, 55, 60, 70, 80, 5, 12);

        list.stream()
            .filter(x -> x % 2 == 0)
            .limit(5)
            .forEach(System.out::println);
    }
}
