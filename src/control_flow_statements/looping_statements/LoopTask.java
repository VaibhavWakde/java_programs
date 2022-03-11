package control_flow_statements.looping_statements;

import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter End Number: ");
        int b = scanner.nextInt();

        int[] even = new int[b];
        int[] odd = new int[b];
        int k = 0;

        for(int i=a;i<=b;i++){
            if (i%2==0){
                System.out.println("Event No. : "+i);
            }
            else{
                System.out.println("Odd No. : "+i);
            }
        }


    }
}
