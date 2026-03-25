//Write a program that uses reduce() to compute the sum of all even numbers.

import java.util.*;
class StreamReduceSumEven{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        List<Integer> arrList=Arrays.asList(12,2,3,5,6,7,8,9);
        
        Integer sumList=arrList.stream()
                                  .reduce(0,(sumEven,b) -> {
                                      if(b%2==0){
                                          return sumEven + b;
                                      }else{
                                          return sumEven;
                                      }
                                      });
                                
        System.out.println(sumList);
    }
}
