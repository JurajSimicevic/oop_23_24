package pckg_exc_1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheAge {

    public static void main(String[] args) {
        theGame();
    }

    private static void theGame(){
        Scanner sc = new Scanner(System.in);
        int target = ThreadLocalRandom.current().nextInt(1, 100);
        int userGuess;
        boolean proceedInput = true;
        int numOfTries = 1;
        System.out.println("Guess the number: ");
        while(proceedInput){
            try{
                userGuess = sc.nextInt();
                if(userGuess < 0){
                    throw new Exception("Input can't be a negative value...");
                }else if(userGuess < target){
                    System.out.println("Number you entered is too low...");
                    numOfTries++;
                }else if(userGuess > target){
                    System.out.println("Number you entered is too high...");
                    numOfTries++;
                }else{
                    System.out.println("Your guessed the number! The number is: " + userGuess);
                    System.out.println("Number of tries: " + numOfTries);
                    proceedInput = false;
                }
            }catch (InputMismatchException ime){
                sc.next();
                System.out.println("Wrong input, need int value for input!");
            }catch (Exception nve){
                System.out.println(nve.getMessage());
            }
        }
    }
}
