package Book.exceptions6;

public class Exceptions6 {

    public static void main(String[] args) {

        String[] Maanden = {"Januari", "Februari", "Mart", "April", "Mei"};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Maanden[i] + " ");
            }
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception:"+exception);
        }
        finally {
            System.out.println("Deze code werkt altijd.");
        }
    }
}
