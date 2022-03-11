package exception_handeling.throws_keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * throws - used to declare which exceptions can be thrown from a method
 * 
 * we can declare multiple exception here
 */
public class ThrowsExample {
    // here we can't throw exception and not catch exception 
    // we just declare exception then that exception
    static void writeFile() throws FileNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("abc.txt");
    }
    
    static void writeFile1() throws FileNotFoundException{
        writeFile();
    }

    // this is caller method for throws
    public static void main(String[] args) {
        try{
            ThrowsExample.writeFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("");
    }
}
