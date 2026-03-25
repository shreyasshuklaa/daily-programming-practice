//Use reduce() to find the minimum value in a list of integers.

import java.util.*;

class StreamReduceMIN{
    public static void main(String[] args){
        Scanner  input=new Scanner(System.in);
        List <Integer> arrList=Arrays.asList(10,20,23,45,56);
        
        int maxElement=arrList.stream()
                              .reduce(Integer.MAX_VALUE,(a,b) -> a<b ? a:b);
                              
        System.out.println(maxElement);                      
    }
}


