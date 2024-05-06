package pckg_coll_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class ClientApp {

    public static void main(String[] args) {
//        User user1 = new User("John", "password1", 23);
//        User user2 = new User("Ivan", "blablabla", 25);
//        User user3 = new User("Joey", "ninjakornjaca", 30);
//        HashMap<Integer, String> users = new HashMap<>();
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user1, users);
//        AUX_CLS.addNewUser(user2, users);
//        AUX_CLS.addNewUser(user3, users);
//        AUX_CLS.listAllMapElements(users);
//        AUX_CLS.listAllMapElementsNew(users);
//        HashSet<String> hset = new HashSet<>();
//        LinkedHashSet<String> lhset = new LinkedHashSet<>();
//        TreeSet<String> tset = new TreeSet<>();
//        AUX_CLS.addElementToSet("Otvoreni", hset);
//        AUX_CLS.addElementToSet("Kod", hset);
//        AUX_CLS.addElementToSet("Linux", hset);
//        AUX_CLS.addElementToSet("Kripto", hset);
//        AUX_CLS.addElementToSet("Otvoreni", lhset);
//        AUX_CLS.addElementToSet("Kod", lhset);
//        AUX_CLS.addElementToSet("Kod", lhset);
//        AUX_CLS.addElementToSet("Linux", lhset);
//        AUX_CLS.addElementToSet("Kripto", lhset);
//        AUX_CLS.addElementToSet("Otvoreni", tset);
//        AUX_CLS.addElementToSet("Kod", tset);
//        AUX_CLS.addElementToSet("Linux", tset);
//        AUX_CLS.addElementToSet("Kripto", tset);
//        AUX_CLS.listAllElementsInSet(hset);
//        AUX_CLS.listAllElementsInSet(lhset);
//        AUX_CLS.listAllElementsInSet(tset);
//        AUX_CLS.removeElementFromSet("Linux", tset);

        HashSet<Robot> robots= new HashSet<>();
        AUX_CLS.addElementToSet(new Robot("Flying robot"), robots);
        AUX_CLS.addElementToSet(new Robot("Weird robot"), robots);
        AUX_CLS.addElementToSet(new Robot("Cleaning robot"), robots);
        AUX_CLS.addElementToSet(new Robot("Thinking robot"), robots);
        AUX_CLS.addElementToSet(new Robot("Friendly robot"), robots);
        AUX_CLS.addElementToSet(new Robot("Humorous robot"), robots);
        AUX_CLS.listAllElementsInSet(robots);
        HashMap<Robot, Integer> robotsMap = new HashMap<>();
        AUX_CLS.addRobotToMap(robotsMap, new Robot("Flying robot"), 30);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("Weird robot"), 50);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("Cleaning robot"), 80);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("Thinking robot"), 68);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("Friendly robot"), 86);
        AUX_CLS.addRobotToMap(robotsMap, new Robot("Humorous robot"), 100);
    }
}
