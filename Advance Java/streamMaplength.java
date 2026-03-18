//Given a list of integers, use map() to multiply each number by 2 and print the new list.
//Example: Input: [1, 2, 3, 4] → Output: [2, 4, 6, 8]

import java.util.*;
import java.util.stream.*;

class streamMaplength {
    public static void main(String[] args) {
        List<String> list=List.of("shreyash","Vikash","shivam");
 
 
       List<Integer> result= list.stream()
                                 .map(x -> x.length())
                                 .collect(Collectors.toList());
       System.out.println(result);
    }
}

