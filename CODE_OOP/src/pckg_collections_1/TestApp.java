package pckg_collections_1;

import pckg_polymorph.AI_Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class TestApp {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        AUX_CLS i = new AUX_CLS();
        TreeSet<Integer> tree = new TreeSet<>();
        HashMap<Integer, String> map = new HashMap<>();
        i.addValueToMap(map,1,"Prvi");
        i.listAllElementsInList(lista);
        i.listAllFromMap(map);
        i.addValueToMap(map,2,"Drugi");
        i.listAllFromMap(map);
        i.addElementToTreeSet(tree,665);

        i.addElementToTreeSet(tree,1);
        i.addElementToTreeSet(tree,3);
//        i.addElementToTreeSet(tree, new AI_Entity("GH-35"));
//        i.addElementToTreeSet(tree, new AI_Entity("TT-56"));
//
//        i.addElementToTreeSet(tree, new AI_Entity("FX-55"));
        i.listElementsFromTreeSet(tree);
    }
}
