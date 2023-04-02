package Book.exceptions6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions2 {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileReader reader=new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deze bestand bestaat niet");
    }
}
