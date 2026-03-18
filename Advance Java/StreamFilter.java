//Given a list of names, filter names ending with "n".

import java.util.*;

class StreamFilter {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Nitin");
        list.add("Vikashn");
        list.add("Shreyash");
        list.add("Shreyas");
        list.add("niteshn");
        list.add("harharMahadevan");
        
        list.stream().filter(n -> n.endsWith("n")).forEach(m-> System.out.println(m));
    }
}
