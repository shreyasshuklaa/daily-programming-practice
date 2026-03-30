//Write a Java program to compute the factorial of a number using the reduce() method.


import java.util.stream.Stream;

class StreamIterateReduceFactorial{
    public static void main(String[] args) {
        int n = 9;

        int factorial = Stream.iterate(1, i -> i + 1)
                              .limit(n)
                              .reduce(1, (a, b) -> a * b);
                              

        System.out.println(factorial);
    }
}
