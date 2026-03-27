// By the use of reduce Merge Multiple List in one List



import java.util.*;

class StreamReduceMergeList{
    public static void main(String[] args){
        List<String> arrList1=Arrays.asList("Vikash","Shivam","Shubham","Uttam");
        
        List<String> arrList2=Arrays.asList("Upadhayay","sharma","Tiwari","Kumar");
        
        List<List<String>> lists=Arrays.asList(arrList1,arrList2);
        List<String> mergelist= lists.stream()
                               .reduce(new ArrayList<> (),(a,b) -> {
                                     a.addAll(b);
                                     return a;
                                 });
        System.out.println(mergelist);
    }
}



