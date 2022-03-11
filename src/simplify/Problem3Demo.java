package simplify;

import java.util.ArrayList;
import java.util.List;

public class Problem3Demo {

    public void findNumbers(int start,int end){
        int[] a ={0,1,5,8,14,18,44,81,89,99,102};

        List<Integer> list = new ArrayList<>();
        int l=0,r=a.length-1;
        int mid =a.length/2;
        int lmid = (l+mid)/2;
        int rmid = (mid+r)/2;
        System.out.println("L mid "+lmid);
        System.out.println("R mid "+rmid);
        System.out.println("mid "+mid);
        System.out.println("l "+l);
        System.out.println("r "+r);
        System.out.println("a[r] "+a[r]);

        System.out.println("start : "+start);
        System.out.println("end : "+end);

        if(a[mid]<=end && a[mid]>=start){
            for(int i=(l+mid)/2;i<=(mid+r)/2;i++){
                if(a[i]>=start &&a[i]<=end){
                    list.add(a[i]);
                }
            }
            System.out.println("mid<=end && mid>=start");
            System.out.println(list);
        }
        else if(a[mid]==end){
            for(int i=l;i<=mid;i++){
                if(a[i]>=start &&a[i]<=end){
                    list.add(a[i]);
                }
            }
            System.out.println("mid==end");
            System.out.println(list);
        }
        else{

            for(int i=mid;i<=r;i++){
                if(a[i]>=start && a[i]<=end){
                    list.add(a[i]);
                }
            }
            System.out.println("mid>end");
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        // get the start time
        long start = System.nanoTime();

        Problem3Demo p1 = new Problem3Demo();
        p1.findNumbers(10,20);

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}
