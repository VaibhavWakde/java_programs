///** Constructor :
// *
// * - java implisitly calls default constructor if we create variable
// *   and didn't initialize it then it gives default value to that varialble.
// *
// * - name of constructor is same as class name
// *
// * - it does not have return type
// *
// * - you can specify access modifiers to constructor
// *
// * - constructor cannot be abstract,synchronised, static and final.
// *
// * - there are two types:
// * 1} Default
// * 2} parameterised
// *
// * 1} Default :-
// *
// *
// *2} parameterised:-
// * - constructor can be overloaded
// *
// * - this keyword can be used to refer current class instance variable.
// *
// */
//
//
//package constructor;
//
//public class Person {
//    private int id =1;
//    private String name = "abc";
//
//    // this is default constructor
//    Person(){
//        System.out.println("in Constructor");
//    }
//
//    // this is paramaterised constructor
//    Person(int id){
//        this.id = id; // - this meaning it consider current level variable (in this case argument )
//    }                 //   if we didn't give this keyword then compiler gets confused which one we want & it takes class variable
//                      //   that's why we use this keyword
//                      // - if our argument name of arguments and variable name is same then we use this keyword to clear
//                      //   that we want class level variable
//
//    Person(int id,String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("B4 obj Creation");
//        Person obj = new Person();
//
//        obj = new Person(3);
//        System.out.println("1st constructor"+obj.id);
//
//        obj = new Person(5,"abc"); // if didn't give any argument it consider default,
//        //                                           if we give one argument then it consider 1st parameterised con.
//        //                                            if we give two argument then it consider 2nd parameterised con.
//        System.out.println("id : "+obj.id);
//        System.out.println("name : "+obj.name);
//
//
//        System.out.println("After obj created");
//        obj = new Person(7,"xyz");
//
//        System.out.println("id : "+obj.id);
//        System.out.println("name : "+obj.name);
//    }
//
//
//}
