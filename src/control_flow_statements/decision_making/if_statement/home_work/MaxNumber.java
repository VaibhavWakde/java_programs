package control_flow_statements.decision_making.if_statement.home_work;

public class MaxNumber {

    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int c = 15;
        if(a>b) {
            if (a > c) {
                System.out.println("a is greater");
            }
        }
        else if (b>c){
            System.out.println("b is greater");
        }
        else if (c>b){
            System.out.println("c is greater");
        }
        else{
            System.out.println("All are Equal");
        }

        int x = 2;
        int y = 2;
        int z =2;
        if(x>=y & x>=z){
            System.out.println("x is greater");
        }
        else if (y>=x && y>=z){
            System.out.println("y is greater");
        }
        else if (z>=x && z>=y){
            System.out.println("z is greater");
        }
//        else{
//            System.out.println("All are Equal");
//        }


    }
}
