package Book.exceptions6;

import javax.swing.*;

public class Exceptions4 {

    public static void main(String[] args) {

        int a;

        try {
            a = Integer.parseInt("Hallo");
            System.out.println("A is:" + a);
        }
        catch (NumberFormatException exception) {
            System.out.println("Exception:" + exception);
        }

        System.out.println("Code werkt.");
    }
}
