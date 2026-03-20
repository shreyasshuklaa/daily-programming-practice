//Skip first 2 numbers, then take next 3 and print. (skip(2) → limit)


import java.util.*;

class StreamSkipLimit {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 15, 22, 33, 40, 55, 60);

        list<Integer> result=list.stream()
                                 .skip(2)
                                 .limit(3)
                                 .tolist();
        System.out.println(result);

    }
}
