//Use reduce() to count how many even numbers are present in a list.


import java.util.*;
class StreamReduceEvenCount{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        List<Integer> arrList=Arrays.asList(12,2,3,5,6,7,8,9);
        
        Integer countList=arrList.stream()
                                  .reduce(0,(count,b) -> {
                                      if(b%2==0){
                                          return count + 1;
                                      }else{
                                          return count;
                                      }
                                      });
                                
        System.out.println(countList);
    }
}
