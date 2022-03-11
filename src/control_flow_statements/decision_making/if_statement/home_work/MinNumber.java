package control_flow_statements.decision_making.if_statement.home_work;

public class MinNumber {

    public static void main(String[] args) {
        int a = 10;
        int b = 9;
        int c = 8;

        if(a<b && a<c){
            System.out.println("a is smaller");
        }
        else if (b<a && b<c){
            System.out.println("b is smaller");
        }
        else{
            System.out.println("c is smaller");
        }
    }
}
