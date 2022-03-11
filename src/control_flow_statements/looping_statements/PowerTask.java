package control_flow_statements.looping_statements;

import java.util.Scanner;

/**              4 ----> Exponent
 *    Base --> 2                    ==> 2^4
 */

public class PowerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base Value : ");
        int base = scanner.nextInt();
        System.out.println("Enter Exponent value : ");
        int exp = scanner.nextInt();
//        int base = 2;
//        int exp = 4;
        int result=1;

        while(exp>0){
            result*=base;
            exp--;
        }
        System.out.println(result);
    }
}
