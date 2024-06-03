package pckg_exc_1;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientApp {

    public static void main(String[] args) throws FileNotFoundException {

//        Scanner sc = new Scanner(System.in);
//        double num;
//        System.out.println("Please enter one number - double expected!");
//        num = sc.nextDouble();
//        System.out.println("You have entered " + num);
//        String filePath = "CODE_OOP/src/pckg_exc_1/primjer.txt";
//        try{
//            ReadContentCls.readFromFile(filePath);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        userAge();

    }

    private static void userAge(){
        Scanner sc = new Scanner(System.in);
        int userDefinedAge;
        boolean proceedInput = true;
        while(proceedInput){
            try{
                System.out.println("Enter your age: ");
                userDefinedAge = sc.nextInt();
                if(userDefinedAge < 0){
                    throw new Exception("Negative value for age is not allowed!");
                }
                System.out.println("User defined age: " + userDefinedAge);
            }catch (InputMismatchException ime){
                sc.next();
                System.out.println("Wrong input, need int value for user defined age!");
            }catch (Exception nve){
                System.out.println(nve.getMessage());
            }finally{
                System.out.println("Enter any number to proceed - anything other to exit");
                if(sc.hasNextInt()){
                    int cont = sc.nextInt();
                    System.out.println("You chose to continue...");
                }else{
                    proceedInput = false;
                    System.out.println("Finished with input!");
                    sc.close();
                }
            }
        }
    }
}
