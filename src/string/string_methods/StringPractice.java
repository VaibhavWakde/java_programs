package string.string_methods;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = new String("Vaibhav");
        String s2 = new String("Vaibhav");

        System.out.println(s1==s2); // false

        System.out.println(s1.equals(s2)); // true

        String s3 = "Vaibhav";
        String s4 = "Vaibhav";

        System.out.println(s3==s4); // true

        String str1 = "Pune";
        String str2 = new String("Pune");
        String str3 = "PUNE";
        String str4 = "Mumbai";
        String str5 = "Thane";
        String str6 = "";

        System.out.println(str1.compareTo(str2)); // 0 (becoz both are same)

        System.out.println(str1.compareTo(str3)); // 32 (becoz compareTo is
                                                  // case sensitive

        System.out.println(str1.compareToIgnoreCase(str3)); // 0 same

        System.out.println(str1.compareTo(str4)); // 3 ( becoz str1 is greater than
                                                  // str2 and
                                                 // difference between M --> P is
                                                // 3 thats why it us 3)

        System.out.println(str4.compareTo(str5)); //-7 ( becoz str4 is less than
                                                  // str5 and
                                                  // difference between T --> M
                                                  // is -7 )


        System.out.println(str5.compareTo(str6)); // 5 (becoz str5 is greater and
                                                  // str6 is empty
                                                  // in str5 there are 5 char
                                                  // thats why output is 5)

        char[] p0={'a','b','c'};
        char[] p1 = new char[]{'a','b','c'};
        String p2 = new String("abc");
        String p3 = "abc";

        System.out.println(p0);
        System.out.println("char object");
        System.out.println(p1);
        System.out.println("string new object");
        System.out.println(p2);
        System.out.println("string object");
        System.out.println(p3);

        char[] charPassword= new char[]{'U','n','k','w','o','n'};

        System.out.println(charPassword);

    }
}
