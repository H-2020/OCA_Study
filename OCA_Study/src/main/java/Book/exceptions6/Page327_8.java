package Book.exceptions6;

public class Page327_8 {
    //a and b are aequals to 0
    int a = 0;
    int b = 0;

    public int  divide() {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("-1");
            return -1;

        } catch (RuntimeException e) {
            return 0;
        } finally {
            System.out.print("done");
        }
    }

    public static void main(String[] args) {
        new Page327_8().divide();
    }
}
