package simplify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class Problem2 extends Thread{

    private List<String> list = Collections.emptyList();
    private String rg;
    private List<String> regex = Collections.emptyList();
    public Problem2(List<String> list, String rg, List<String> regex){
        this.list = list;
        this.rg = rg;
        this.regex = regex;
    }
    @Override
    public void run() {
        list.forEach(s -> {
            if (Pattern.matches(rg,s)){
                System.out.println("String : "+list.indexOf(s)+" matches regex : "+regex.indexOf(rg));

            }
        });

    }


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

        regex.forEach(r -> {
            Problem2 problem2 = new Problem2(string,r,regex);
            problem2.start();
        });
    }
}
