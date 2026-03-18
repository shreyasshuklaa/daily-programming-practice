//Given a list of Employees (salary), filter employees with salary greater than 50,000.

import java.util.*;

class streamFilterSqrt {
    public static void main(String[] args) {
        List<Integer> list=List.of(23,34,45,1,2,3,67,1000,450000,456000,3400000);
        
        
        list.stream().filter(n -> Math.sqrt(n)>500).forEach(m-> System.out.println(m));
    
    

    }
}

