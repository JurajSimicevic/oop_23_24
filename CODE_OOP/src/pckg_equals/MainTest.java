package pckg_equals;

public class MainTest {

    public static void main(String[] args) {
        User user1 = new User("name1");
        User user2 = new User("name2");

        System.out.println(user1);
        System.out.println(user2);
        user1.showHashCodeAsHex();
        user2.showHashCodeAsHex();

        System.out.println("-----------------------------------");
        System.out.println(user1 == user2);
        System.out.println(user1.equals(user2));
    }

}
