package static_keyword;

/**
 * The static keyword in Java
 * is used for memory management mainly. We can apply static keyword with variables, methods,
 * blocks and nested classes.
 * The static keyword belongs to the class than an instance of the class.
 *
 * The static can be:
 *
 *     Variable (also known as a class variable)
 *     Method (also known as a class method)
 *     Block
 *     Nested class
 *
 *
 *
 * static Variable:
 * - static variable allocate memory once and it is in method area.
 * - static variable is same for all the class if we change static variable value then it change actual value.
 */

public class StaticVariable {
    Integer id;
    String name;
    static String college = "PRMIT&R";

    StaticVariable(Integer i, String s){
        id = i;
        name = s;
    }

    void display(){
        System.out.println("id : "+id+", name: "+name+", college : "+college);
    }

    public static void main(String[] args) {
        StaticVariable sv1 = new StaticVariable(1,"abc");
        StaticVariable sv2 = new StaticVariable(2,"pqr");
        StaticVariable sv3 = new StaticVariable(3,"xyz");

        sv1.display(); // id : 1, name: abc, college : PRMIT&R
        sv2.display(); // id : 2, name: pqr, college : PRMIT&R
        sv3.display(); // id : 3, name: xyz, college : PRMIT&R
    }
}
