package control_flow_statements.decision_making.switch_statement.home_work;

public class Calculator {
    public static void main(String[] args) {
        int x = 10;
        int y =12;

        String a ="asdf";

        switch (a){
            case "add":
                System.out.println("Addition of Two No. is : "+(x+y));
                break;
            case "sub":
                System.out.println("Substraction of Two no. is : "+(x-y));
                break;
            case "mul":
                System.out.println("Multiplication of Two no. is : "+(x*y));
                break;
            case "div":
                System.out.println("Division of Two no. is : "+(x/y));
                break;
            default:
                System.out.println("Modulo of Two no. is : "+(x%y));

        }
    }
}
