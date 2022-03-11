package control_flow_statements.looping_statements;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i =1;
        int sum=0;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}

// take 2 nos. from user and 2nd no is power of 1st no

// swap 2 nos. a=10 b=20 --> a=20 b=10