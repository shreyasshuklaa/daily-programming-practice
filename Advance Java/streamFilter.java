//Given a list of integers, filter numbers divisible by 3 but not by 5.

import java.util.*;

class streamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(23);
        list.add(30);
        list.add(33);
        
        list.stream().filter(n -> n%3==0 && n%5!=0).forEach(m-> System.out.println(m));
    }
}

