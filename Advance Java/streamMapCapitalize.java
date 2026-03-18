//Convert a list of strings so that each string is capitalized (i.e., first letter uppercase, rest lowercase).
//Example: "hello" → "Hello"


import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> list=List.of("shreyash","harharMahadev","shivam");
 
 
       List<Integer> result= list.stream()
                                 .map(x -> x.subString(0,1).toupperString()+x.substring(1))
                                 .collect(Collectors.toList());
       System.out.println(result);
    }
}
