package simplify;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public void findNumber(int start,int end){
        int[] a ={0,1,5,8,14,18,44,81,89,99,102};
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            if(a[i]>=start && a[i]<=end){
                list.add(a[i]);
            }
        }
        System.out.println("Numbers are : ");
        System.out.println(list.size());
    }

    public static void main(String[] args) {
        // get the start time
        long start = System.nanoTime();

        Solution3 t = new Solution3();
        t.findNumber(10,20);

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
