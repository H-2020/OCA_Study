package Book.exceptions6;

public class Page328_11 {


    public String name;

    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        }catch (NumberFormatException e) {
            System.out.print("4");
        }
//        finally{
//            System.out.println("finally");
//        }

//        catch (NullPointerException e) {
//            System.out.print("4");
//        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        Page328_11 leo = new Page328_11();
        leo.name = "Leo";
        leo.parseName();
        System.out.print("6");
    }
}
