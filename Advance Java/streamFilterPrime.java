//Given a list of numbers, filter only prime numbers.


import java.util.*;

class streamFilterPrime{
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 3, 4, 5, 6, 7, 8, 9, 11);

        list.stream()
            .filter(n -> {
                if (n <= 1) return false;
                for (int i = 2; i < n; i++) {
                    if (n % i == 0)
                        return false;
                }
                return true;
            })
            .forEach(System.out::println);
    }
}
