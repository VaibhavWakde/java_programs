package simplify;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Solution1 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();

        string.add("The patient should be informed of his therapeutic options.");
        string.add("It wouldn't be as if the lone astronaut would be completely by himself.");
        string.add("Now, a writer is entitled to have a Roget on his desk.");
        string.add("Somebody should let you borrow their book");
        string.add("From the earliest times until about the 1960s");
        string.add("whether we may not, nay ought not, to use a neutral pronoun relative");
        string.add("phone 9280018281");
        string.add("Notionalplurality");
        string.add("A starting point would be to give more support");
        string.add("abc@gmail.com");

        List<String> regex = new ArrayList<>();
        regex.add(".*\\.$");
        regex.add(".*\\d{10}.*");
        regex.add(".*@.*");
        regex.add("\\w+");
        regex.add(".*\\s.*");

        string.forEach(s -> {
            regex.forEach(r->{
                if(Pattern.matches(r,s)){
                    System.out.println("String : "+string.indexOf(s)+" matches regex : "+regex.indexOf(r));
                }
            });
        });
    }
}
