package exception_handeling.arrayIndexOutOfBodyException;

import java.util.Scanner;

public class ArrayIndexOutOfBody {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner= new Scanner(System.in);

        for(int i=1; i< arr.length;i++)
            arr[i]= scanner.nextInt();

        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());

        }
        finally {
            scanner.close();
        }
    }
}
