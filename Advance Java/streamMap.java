//Convert a list of strings to uppercase using map().



import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        List<String> list=List.of("shreyash","harharMahadev","shivam");
 
 
       List<String> result= list.stream()
                                 .map(x -> x.toUpperCase())
                                 .collect(Collectors.toList());
       System.out.println(result);
    }
}

