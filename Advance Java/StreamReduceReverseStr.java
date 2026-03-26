//Use reduce() to reverse a given string.

import java.util.*;

class StreamReduceReverseStr{
    public static void main(String[] args){
        
        List<String> arrList=Arrays.asList("Shivam","Vikash","Major","Ajit");
        
        String ReverseStr=arrList.stream()
                                 .reduce("",(a,b) -> {
                                    String temp="";
                                     for(int i=b.length()-1;i>=0;i--){
                                         temp+=b.charAt(i);
                                     }
                                     return a+temp+" ";
                                 });
                                 
        System.out.println(ReverseStr);
    }
}

