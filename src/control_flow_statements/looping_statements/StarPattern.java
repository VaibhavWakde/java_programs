package control_flow_statements.looping_statements;

public class StarPattern {
    public static void main(String[] args) {
        for(int i = 0;i<=4;i++){
            for(int j = 4; j>=i;j--){
                System.out.print(" ");
            }
            for(int k =1 ; k<=i;k++){

                System.out.print(" *");
            }

            System.out.println();
        }
        for(int i = 0;i<=4;i--){
            for(int j = 4; j>=i;j--){
                System.out.print(" ");
            }
            for(int k =1 ; k<=i;k++){

                System.out.print(" *");
            }

            System.out.println();
        }
//        int row = 5;
//
//        for(int i = 0;i<row;i++){
//            for(int j =2*(row-i);j>=0;j--){
//                System.out.print(" ");
//            }
//            for(int k=0;k<=i;k++){
//                System.out.print(" *");
//            }
//            System.out.println();
        //}
    }
}

/**
 *        *
 *      * *
 *    * * *
 *  * * * *
 *
 *
 *  reverse string in half its iteration string should get reversed.
 */
