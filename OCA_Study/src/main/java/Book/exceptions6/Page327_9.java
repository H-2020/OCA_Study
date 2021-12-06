package Book.exceptions6;

public class Page327_9 {


    public void start() {
        try {
            System.out.print("Starting up ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Problem ");
           // System.exit(0);
        } finally {
            System.out.print("Shutting down ");
        }
    }

    public static void main(String[] args) {
        new Page327_9().start();
    }
}

