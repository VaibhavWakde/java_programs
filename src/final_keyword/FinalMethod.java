
/** Final Method :-
 *
 * - If you make any method as final, you cannot override(same name same parameter) it. ( we can't chance method )
 * - we can implement that method only.
 *
 *
 */
package final_keyword;

public class FinalMethod {

    final void Vehicle (){
        System.out.println("Run");
    }


}


class TwoWheeler extends FinalMethod{
    public static void main(String[] args) {

        FinalMethod finalMethod = new FinalMethod();

        finalMethod.Vehicle(); // Run
    }
}
