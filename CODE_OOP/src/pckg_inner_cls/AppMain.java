package pckg_inner_cls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AppMain {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(124);
        lst.add(322);
        lst.add(234);
        lst.add(1);

        Iterator<Integer> iter = lst.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        for(Integer element : lst){
            int element_new = element*2;
            System.out.println(element_new);
        }
    }
}
