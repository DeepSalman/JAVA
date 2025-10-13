package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Basic2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(61);
        a.add(20);
        a.add(33);
        a.add(43);
        a.add(59);
        a.add(62);
        a.add(74);
        a.add(83);
        a.add(99);
        a.add(101);

        Collections.sort(a);
        System.out.println(a);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);


        ArrayList<String> b = new ArrayList<>();
        b.add("ab");
        b.add("ba");
        b.add("cca");
        b.add("eg");
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);
        Collections.sort(b,Collections.reverseOrder());
        System.out.println(b);

    }
}
