//Given a list of strings, filter strings that contain the letter "e".

import java.util.*;

class streamFilterContains {
    public static void main(String[] args) {
        List<String> list=List.of("Shreyash","harharMahadev","Mangal","Vikash");
        
        
        list.stream().filter(n -> n.contains("e")).forEach(m-> System.out.println(m));
    }
}
