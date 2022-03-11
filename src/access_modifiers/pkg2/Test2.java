package access_modifiers.pkg2;

import access_modifiers.pkg1.User;

public class Test2 extends User {
    public static void main(String[] args) {
        Test2 test2obj = new Test2();

        test2obj.displayProtected(); // we can access it if we inherit Protected method class as parent class to this class.
        test2obj.displayPublic();
//        test2obj.displayDefault(); // we can't access default access modifier out of the package
    }
}
