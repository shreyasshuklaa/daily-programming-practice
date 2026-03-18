//Given a list of integers, use map() to multiply each number by 2 and print the new list.
//Example: Input: [1, 2, 3, 4] → Output: [2, 4, 6, 8]

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<Integer> list=List.of(23,34,45,1,2,3,67,1000,450000,456000,3400000);
 
 
       List<Integer> result= list.stream()
                                 .map(x -> x*2)
                                 .collect(Collectors.toList());
       System.out.println(result);
    }
}

