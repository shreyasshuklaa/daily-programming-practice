//Given a list of strings, use map() to find the length of each string.

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

