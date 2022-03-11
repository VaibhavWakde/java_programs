package control_flow_statements.decision_making.switch_statement;

public class Switch {

    public static void main(String[] args) {
        int input = 5;
        switch (input){ // it return only int, short, byte, String
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is Saturday");
        }

        String s = "6";
        switch (s){ // it return only int, short, byte, String
            case "1":
                System.out.println("Today is Sunday");
                break;
            case "2":
                System.out.println("Today is Monday");
                break;
            case "3":
                System.out.println("Today is Tuesday");
                break;
            case "4":
                System.out.println("Today is Wednesday");
                break;
            case "5":
                System.out.println("Today is Thursday");
                break;
            case "6":
                System.out.println("Today is Friday");
                break;
            default:
                System.out.println("Today is Saturday");
        }

    }
}
