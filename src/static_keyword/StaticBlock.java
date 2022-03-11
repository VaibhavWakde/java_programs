package static_keyword;

/**
 * static Block:
 * 
 * Is used to initialize the static data member.
 * It is executed before the main method at the time of classloading.
 */

public class StaticBlock {

    static {
        System.out.println("in static Block");
    }

    public static void main(String[] args) {
        System.out.println("in main method");
    }

}

// in static Block
// in main method
