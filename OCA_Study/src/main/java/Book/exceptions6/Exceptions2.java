package Book.exceptions6;

public class Exceptions2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c;


       try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException exception) {
            exception.printStackTrace();
        }

        System.out.println("Code werkt.");
    }
}
