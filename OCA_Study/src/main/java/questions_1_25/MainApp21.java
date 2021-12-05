package questions_1_25;

public class MainApp21 {
    int x, y;

    public MainApp21(int x, int y) {
        initialize(x, y);
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        MainApp21 obj = new MainApp21(x, y);
        //System.out.println(obj.x+" "+obj.y);
        System.out.println(x + " " + y);
    }
}