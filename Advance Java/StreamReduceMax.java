//Use reduce() to find the maximum value in a list of integers.


import java.util.*;

class StreamReduceMax{
    public static void main(String[] args){
        Scanner  input=new Scanner(System.in);
        List <Integer> arrList=Arrays.asList(10,20,23,45,56);
        
        int maxElement=arrList.stream()
                              .reduce(Integer.MIN_VALUE,(a,b) -> a>b ? a:b);
                              
        System.out.println(maxElement);                      
    }
}

