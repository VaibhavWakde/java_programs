package control_flow_statements.decision_making.if_statement.home_work;

public class Divisible {
    public static void main(String[] args) {
        int a = 10;
        if (a%3==0 && a%5==0){
            System.out.println("Divisible by 3 and 5 both");
        }
        else if(a%3==0){  // if we give here if only then it also execute this condition
            System.out.println("Divisible by 3.");
        }
        else if (a%5==0){
            System.out.println("Divisible by 5.");
        }
        else{
            System.out.println("Not Divisible by 3 or 5");
        }
    }
}
