package Book.exceptions6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptions1 {
    public static void main(String[] args) throws FileNotFoundException {

        String a="..src/main/java/Book.exceptions6/Page309";
        FileInputStream fis=new FileInputStream(a);
    }
}
