package questions_1_25;

public class Test7 {
    int x, y;

    public Test7(int x, int y) {
//        System.out.println("constructor");
        initialize(x, y);
    }

    public void initialize(int x, int y) {
//        System.out.println("initializer");
        this.x = x * x;
        this.y = y * y;
    }

    public static void main(String[] args) {
        int x = 9, y = 5;
        Test7 obj = new Test7(x, y);
        System.out.println(x + " " + y);
//        System.out.println(obj.x+" "+obj.y);

    }
}
