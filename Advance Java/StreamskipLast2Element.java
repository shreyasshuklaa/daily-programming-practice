//Skip last 2 elements using stream. (limit < size - 2)


import java.util.*;

class StreamskipLast2Element {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50, 60);

        int size = list.size();

        list<Integer> result=list.stream()
                                 .limit(size - 2)
                                 .tolist();
        System.out.println(result);

    }
}
