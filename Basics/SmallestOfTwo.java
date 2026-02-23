import java.util.Scanner;

public class SmallestOfTwo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int smallest;
        
        if (a <= b) {
            smallest = a;
        } else {
            smallest = b;
        }
        
        System.out.println(smallest);
        sc.close();
    }
}
