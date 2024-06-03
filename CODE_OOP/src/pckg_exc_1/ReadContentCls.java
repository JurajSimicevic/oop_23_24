package pckg_exc_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentCls {


    public static void readFromFile(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.println("Line : " + line);
        }
    }
}
