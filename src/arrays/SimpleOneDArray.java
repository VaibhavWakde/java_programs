package arrays;


public class SimpleOneDArray {
    public static void main(String[] args) {
        int arr[]; // declare
        arr = new int[5]; // instantiation

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
       // System.out.println(arr[5]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
                                    //at SimpleOneDArray.main(SimpleOneDArray.java:16)


        System.out.println(arr); // [I@119d7047 ( it prints hexadecimal value which is memory address )


        String empName[] = {"A","B"};
        String []names = new String[2];
//        String[] names = new String[2];

        names[0]="X";
        names[1]="y";
        System.out.println(names[0]); // X
        System.out.println(empName[1]); // B
        //System.out.println(names[-1]); // Exception error

        System.out.println(names); // it will give output hexadecimal value (which is address of memory)
    }
}
