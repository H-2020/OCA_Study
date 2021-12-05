package questions_51_75;

public class App51 {

     static int count;//static olmazsa statik metodta cagrilamaz

    public static void displayMsg(){

        count++;
        System.out.println("Welcome visit count"+count);
    }

    public static void main(String[] args) {
        App51.displayMsg();
        App51.displayMsg();
    }
}
