package pckg_collections_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int MAXI = 100;

    public static void addNewUser(User user, HashMap<Integer, String> users){
        if(users.containsKey(user.getUserID())){
            System.out.println("User " + user.getUserID() + " already in this map!");
        } else {
            users.put(user.getUserID(), user.getUserName());
            System.out.println("User " + user.getUserID() + " added!");
        }
    }

    public static <K, V> void listAllMapElements(HashMap<K, V> map){
        System.out.println("---------------------------------------------");
        for(K key : map.keySet()){
            System.out.println("ID: " + key + " UserName: " + map.get(key));
        }
    }

    public static <K, V> void listAllMapElementsNew(HashMap<K, V> map){
        System.out.println("---------------------------------------------");
        for(Map.Entry<K, V> entryset : map.entrySet()){
            System.out.println("Key: " + entryset.getKey() + " Value: " + entryset.getValue());
        }
    }

    public static <E> void addElementToSet(E element, Set<E> elements){
        if(elements.add(element)){
            System.out.println("Element " + element + " added!");
        } else {
            System.out.println("Element " + element + " already in the set!");
        }
    }

    public static <E> void listAllElementsInSet(Set<E> set){
        System.out.println("---------------------------------------------");
        for(E element : set){
            System.out.println(element);
        }
    }

    public static <E> void removeElementFromSet(E element, Set<E> elements){
        if(elements.remove(element)){
            System.out.println("Removed " + element + " from " + elements.getClass().getSimpleName());
        }else{
            System.out.println("Element not in the set!");
        }
    }

    public static <K, V> void addRobotToMap(Map<K, V> map, K key, V value){
        if(map.containsKey(key)){
            System.out.println("Robot " + key + " already in this map!");
        }else{
            map.put(key, value);
            System.out.println("New robot added!");
        }
    }

    private static int generateRandomGrade(){
        return ThreadLocalRandom.current().nextInt(0, MAXI);
    }
}
