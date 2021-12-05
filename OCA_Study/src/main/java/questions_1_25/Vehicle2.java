package questions_1_25;

class Vehicle2 {
    int x;

    Vehicle2() {
        this(10);}

    Vehicle2(int x) {
        this.x = x;    }

}
class Car extends Vehicle2 {
    int y;

    Car() {
       super(10);    }

    Car(int y) {
        super(y);

        this.y = y;    }

    public String toString() {
        return super.x + " " + this.y;
    }

    public static void main(String[] args) {
        Vehicle2 y = new Car(20);
        System.out.println(y);
//       Car c=new Car(5);
//      System.out.println(c);
    }
}

