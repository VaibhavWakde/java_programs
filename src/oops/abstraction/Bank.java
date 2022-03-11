package oops.abstraction;

/**
 * - It is process of hiding implimantation details and showing only functional details to user.
 *
 * - we have to specify "Abstract" keyword berfore class.
 *
 * - if we create abstract method in public class then it shows error.
 *
 * - if we declared non-abstract method without body it shows error.
 *
 * - but we can create abstract method without its body.
 *
 * - we cannot create object of Abstract class.
 *
 * - It can have final method
 *
 * - It cannot be instantiated(तत्काळ).
 *
 * - for accessing abstact class properties we have to create a child class and then in 3rd class we have to access
 *   Abstract class by creating object. ex: Abstract_class_name obj = new child_class_name();
 *
 * - Constructor is same as function, in Abstract Class constructor name should be same as the Abstract class name.
 *   constructor returns nothing.
 *   There are two types of Constructor:
 *   1) Default
 *   2) Parametric constructor --> just we can give parameters in constructor.
 *
 *
 *
 */


abstract class Bank {
    Bank(){

        System.out.println("Bank Created");
    }

    abstract int getRateOfInterest();

    void getDetails(){

        System.out.println("Bank's Details");
    }
}
