//Write a program to multiply all numbers in a list using the reduce() method.


import java.util.*;

class StreamReduceMULTIPLY{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        List<Integer> listarr=Arrays.asList(10,20,30,40,50);
        
        int multiply=listarr.stream().reduce(1,(a,b)->a*b);
        System.out.println(multiply);
    }
}
