package pckg_collections_2;

import java.util.ArrayList;
import java.util.Collections;

public class AppTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Automobil");
        list.add("Kajić");
        list.add("Skateboard");
        list.add("Romobil");
        list.add("Bicikl");
        list.add("Avion");
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        LengthStringComparator lenghtStringComparator = new LengthStringComparator();
        Collections.sort(list, lenghtStringComparator);
        System.out.println(list);
    }
}
