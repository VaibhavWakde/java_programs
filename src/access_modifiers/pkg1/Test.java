package access_modifiers.pkg1;


public class Test {
    public static void main(String[] args) {
        User userObj = new User();

        userObj.displayPublic();
        userObj.displayDefault();
        userObj.displayProtected();
//        userObj.displayPrivate();  // we can't access private out of the class anyhow
    }
}
