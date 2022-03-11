package break_and_continue;

/**
 * break statement:
 * - it break the loop of any of loop or terminate from the loop.
 */

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                //breaking the loop
                break;
            }
            System.out.println(i);
        }
    }
}
