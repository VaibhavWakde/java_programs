import simplify.Problem3Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public class Test {
//    public static void main(String[] args) {
////        Integer[] arr = {1,2,2,5,55,55,5,5,5};
////        Integer[] arr1;
////
////        for(int i = 0;i<arr.length;i++){
////            for(int j = arr.length-1;j>0;j--){
////
////            }
////        }
//
//        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        double d = scan.nextDouble();
//        scan.nextLine();
//        String s = scan.nextLine();
//
//        System.out.println("String : "+s);
//        System.out.println("Double : "+d);
//        System.out.println("Interger : "+i);
//    }
//}


//class B{
//    A4 objj;
//    B(A4 obj){
//        this.objj=obj;
//    }
//    void display(){
//        System.out.println(objj.data);//using data member of A4 class
//    }
//}
//
//class A4{
//    int data=10;
//    A4(){
//        B b=new B(this);
//        b.display();
//    }
//    public static void main(String args[]){
//        A4 a=new A4();
//    }
//}


//class Test{
//    static final int a;
//    int b;
//
//    static {
//        a=10;
//    }

//    void sum(){
//       a=2;
//        System.out.println(a);
//    }
//
//    static void xyz(){
//        b=3;
//    }
//
//    public static void main(String[] args) {
//        Test test = new Test();
//        test.sum();
//    }


//}
//0 1 5 8 14 18 44 81 89 99 102

class Test {

    public void findNumber(int start,int end){
        int[] a ={0,1,5,8,14,18,44,81,89,99,102};
        List<Integer> list = new ArrayList<>();

            for(int i=0;i<a.length;i++){
                if(a[i]>=start && a[i]<=end){
                    list.add(a[i]);
                }
            }
        System.out.println("Numbers are : ");
        System.out.println(list);
    }

    public static void main(String[] args) {



        // get the start time
        long start = System.nanoTime();

        Test t = new Test();
        t.findNumber(10,20);

        // get the end time
        long end = System.nanoTime();

        // execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }
}