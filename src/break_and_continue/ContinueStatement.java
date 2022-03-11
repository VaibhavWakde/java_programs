package break_and_continue;

/** continue statement:
 * - it will continue to the loop
 * - it will skip the remaining part after that continue statement and execution comes at loop again.
 *
 */

public class ContinueStatement {
    public static void main(String[] args) {

        //for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }
}
