
import java.util.Scanner;

public class AppClient {

    // dodaj modifikator kako bi se granica mogla koristiti u main metodi
    static Float granica = 100.45f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// konstruktor za Scanner
                System.out.println("Unesite jedan realni broj - float: \n");
        Float inpt = sc.nextFloat();// pripadna metoda za Float; // zanemarite provjeru unosa
        if(numDec(inpt)){ // pozovite pomoćnu metodu s vašim unosom kao argumentom
            System.out.println("Unos je Float tipa....");
            // Ako je unos veći od granice
            if(inpt > granica){
                System.out.println(inpt + " je veći od postavljene granice -> " + granica);
            } else {
                System.out.println(inpt + " je manji ili jednak od postavljene granice -> " + granica);
            }
        } else {
            System.out.println("Unesena je cjelobrojna vrijednost!");
        }

    }

    // Ovdje ne trebate ništa mijenjati
    static boolean numDec(Float input){
        String num = String.valueOf(input);
        num = num.substring(num.indexOf(".")+1);
        if (Integer.parseInt(num) == 0){
            return false;
        }else{
            return true;
        }
    }
}