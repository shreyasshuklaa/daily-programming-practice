//Write a program to concatenate all strings in a list using the reduce() method.



import java.util.*;
class StreamReduceCONCATstring{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        List<String> arrList=Arrays.asList("Shreyash ","Shukla","is Excellent"," programmer");
        
        String concateList=arrList.stream()
                                  .reduce("",(a,b) -> a+b);
        System.out.println(concateList);
    }
}
