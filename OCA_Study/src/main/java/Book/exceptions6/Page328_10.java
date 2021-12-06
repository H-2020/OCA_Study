package Book.exceptions6;

public class Page328_10 {

    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        }
    }

    public static void main(String[] args) {
        Page328_10 leroy = new Page328_10();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.print("5");
    }
}
