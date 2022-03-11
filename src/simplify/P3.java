package simplify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,1,5,8,14,18,44,81,89,99,102));

        System.out.println(list);

        Integer l =0;
        Integer r = list.toArray().length;
        Integer mid = (list.toArray().length-1)/2;

        System.out.println(r);

    }
}
