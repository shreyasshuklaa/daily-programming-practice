//Write a Java program that uses the reduce() method to find the sum of all elements in a list.

import java.util.*;

class SumReduce {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        int sum = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);
    }
}
