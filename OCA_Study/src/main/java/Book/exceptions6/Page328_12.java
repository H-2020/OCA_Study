package Book.exceptions6;

public class Page328_12 {


    public String name;

    public void run() {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
         //   throw e;
        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        Page328_12 jerry = new Page328_12();
        jerry.run();
        System.out.print("6");
    }
}
