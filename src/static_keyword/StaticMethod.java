package static_keyword;

/** Static Method:
 *
 * If you apply static keyword with any method, it is known as static method.
 *
 *     A static method belongs to the class rather than the object of a class.
 *     A static method can be invoked without the need for creating an instance of a class.
 *     A static method can access static data member only and can change the value of it.
 *     we can call static method with the help of class name only.
 *
 * The static method is used that will exist independently of any instances created for the class.
 *
 * There are two main restrictions for the static method. They are:
 *
 *     The static method can not use non static data member or call non-static method directly.
 *     this and super cannot be used in static context.
 */

public class StaticMethod {
    Integer id;
    String name;
    static String college="ABC";

    static void  change(){
        college = "PQR";
    }

    StaticMethod(Integer i, String s){
        id=i;
        name=s;
    }

    void display(){
        System.out.println("Id: "+id+", name: "+name+", college: "+college);
    }

    public static void main(String[] args) {
        StaticMethod sm1 = new StaticMethod(1,"abc");
        StaticMethod sm2 = new StaticMethod(2,"pqr");
        StaticMethod sm3 = new StaticMethod(3,"xyz");

        sm1.display(); // Id: 1, name: abc, college: ABC
        StaticMethod.change();

        sm2.display(); // Id: 2, name: pqr, college: PQR
        sm3.display(); // Id: 3, name: xyz, college: PQR

    }
}
