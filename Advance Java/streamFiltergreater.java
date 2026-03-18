//Given a list of Employees (salary), filter employees with salary greater than 50,000.
import java.util.*;

class streamFiltergreater {
    public static void main(String[] args) {

        List<Integer> Salarylist = List.of(500, 200, 46000, 45000, 56000);

        Salarylist.stream()
                .filter(n -> n > 50000)
                .forEach(m -> System.out.println(m));
    }
}

