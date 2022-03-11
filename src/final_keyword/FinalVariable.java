/** Final variable :
 *
 * Final is non-access modifier
 * Final keyword used for restriction
 * Final can be used with variables, methods, classes
 *
 * 1. Final Variable :- constant value, can't change the value
 * 2. Final Method :- prevent overriding
 * 3. Final Class :- prevent inherit
 *
 *
 * 1. Final Variable :-
 *
 * - initialize one time only
 * - Use always upper casings
 * - either intialize when it declared or
 * - if final variable is static declared but not initialize then we can initialize it in static block...
 * - if it is non-static  declared but not initialize then we can initialize in constructor...
 *
 */
package final_keyword;


public class FinalVariable {
    final float PI;
    final static float variable;

    static {
        variable = 55;
    }

    FinalVariable(){
        PI = 3.14f;
    }

    public static void main(String[] args) {
        final int a = 10;
//        a++;   // it shows error we can't change value of final variable
        System.out.println(a);
    }
}
