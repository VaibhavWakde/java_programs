package control_flow_statements.looping_statements;

import java.util.Scanner;

public class SwapNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b= scanner.nextInt();
        int temp;
        if(a!=b){
            temp =a;
            a=b;
            b=temp;
        }
        System.out.println(a);
        System.out.println(b);



    }
}
