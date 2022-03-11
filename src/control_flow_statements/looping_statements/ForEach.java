package control_flow_statements.looping_statements;
/** For Each or Enhanced for loop:
 *
 *- The for-each loop is used to iterate / traverse array or collection in Java.
 *- It works on the basis of elements and not the index.
 *- It returns element one by one in the defined variable.
 *
 * Syntax :
 *
 *      for(data_type variable : array | collection){
 *      //body of for-each loop
 *      }
 *
 *
 *
 */
public class ForEach {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int no:a){
            System.out.println(no);
        }
    }
}
