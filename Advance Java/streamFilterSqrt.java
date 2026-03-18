//Given a list of integers, filter numbers whose square is greater than 500.

import java.util.*;

class streamFilterSqrt {
    public static void main(String[] args) {
        List<Integer> list=List.of(23,34,45,1,2,3,67,1000,450000,456000,3400000);
        
        
        list.stream().filter(n -> Math.sqrt(n)>500).forEach(m-> System.out.println(m));
    
    

    }
}

