import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int product = a * b;

        System.out.println(product);

        input.close();
    }
}
