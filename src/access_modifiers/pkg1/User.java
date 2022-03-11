/** Access Modifiers :
 *
 * 1} Public :-
 *
 * - we can access it into anywhere.
 *
 * 2} Default :-
 *
 * - we can access it within the same package only.
 * - we can't access out of the package even if we inherit.
 *
 * 3} Private :-
 *
 * - we can access it within Class only.
 *
 * - we can't access it out-side the class even if we inherit.
 *
 * 4} Protected :-
 *
 * - we can access it within the package or outSide the package but we have to inherit it.
 *
 *
 *
 *
 */





package access_modifiers.pkg1;

public class User {
    private String name = "Access Modifier";


    public void displayPublic(){
        System.out.println("This is Public "+name);
    }

    void displayDefault(){
        System.out.println("This is Default "+name);
    }

    private void displayPrivate(){
        System.out.println("This is Private "+name);
    }

    protected void displayProtected(){
        System.out.println("This is Protected "+name);
    }
}
