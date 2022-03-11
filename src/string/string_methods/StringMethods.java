package string.string_methods;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "vaibhav";

        String str1 = "Hello ";
        String str2 = "Good Morning";

        char[] ch = {1,2,3,4};

        String string= new String(ch);

        char a;
        String estr="";

        System.out.println("charAt()");
        System.out.println(name.charAt(3));

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());

        System.out.println(name.isEmpty());

        System.out.println(str1.concat(str2));

        System.out.println(name.length());

        System.out.println(str1.replace('H', 'h'));

        System.out.println(name.replaceAll("a", "A"));

        System.out.println("indexof()");
        System.out.println(str2.indexOf("Morning", 2));

        System.out.println(name.startsWith("vaibhav"));

        System.out.println(str2.endsWith("Morning"));

        for(int i =0;i<name.length();i++){
            a = name.charAt(i);
            estr = a+estr;
        }
        System.out.println(estr);
    }
}
