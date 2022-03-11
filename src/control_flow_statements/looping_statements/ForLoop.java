

/** For Loop :
 *
 * To Get input from user:
 *
 * - we use Scanner which is pre-defined in util package.
 *
 * Scanner sc = new Scanner(system.in);
 * if we want Int as input then --> Int no = sc.nextInt()
 *
 * for String --> String s = sc.nextLine();
 *
 * for Long --> long l = sc.nextLong();
 *
 * for Double --> double d = sc.nextDouble();
 *
 *
 * We also give input Command line
 * int no = Integer.parseInt(args[0]);
 * then go run/edit configurations/ agr pass value...
 */

package control_flow_statements.looping_statements;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) { // why argument is String[] always becoz we can use any datatype in String.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter No : ");
//        int no = sc.nextInt();

        int no = Integer.parseInt(args[0]);
        System.out.println("No is : "+no);
        for(int i = 1; i<11 ; i++){
            System.out.println(no*i);
        }
    }
}
