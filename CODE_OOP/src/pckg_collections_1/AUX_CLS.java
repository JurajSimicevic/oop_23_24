package pckg_collections_1;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class AUX_CLS<E> {
    public <E> void addElementToList(List<E> lista, E element){
        lista.add(element);
    }

    public void addElementToTreeSet(TreeSet<E> set, E element){
        set.add(element);
    }

    public <K,V> void addValueToMap(HashMap<K, V> elements, K key, V value){
        elements.put(key, value);
    }

    public <E> void listAllElementsInList(List<E> list){
        for(E element : list){
            System.out.println(element);
        }
    }

    public <E> void listElementsFromTreeSet(TreeSet<E> set){
        for(E element : set){
            System.out.println(element);
        }
    }

    public <K,V> void listAllFromMap(HashMap<K,V> map){
        for(K k : map.keySet()){
            System.out.println("Key: "+k+" | Value: "+map.get(k));
        }
    }
}
