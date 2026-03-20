//Count distinct values after skipping first 3. (skip(3) → distinct)


import java.util.*;

class StreamSkipDistinctCount {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 22, 22, 40, 55, 60, 60, 80);

        long count = list.stream()
                         .skip(3)
                         .distinct()
                         .count();

        System.out.println(count);
    }
}
