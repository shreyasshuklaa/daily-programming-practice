//Use reduce() to find the longest string in a list of strings.


import java.util.*;

class StreamReduceLongest_Str{
    public static void main(String[] args){
        
        List<String> arrList=Arrays.asList("Shivam","Vikash","Major","Ajit");
        
        String longestStr=arrList.stream()
                                 .reduce("",(a,b) -> a.length()>b.length() ? a:b);
                                 
        System.out.println(longestStr);
    }
}
