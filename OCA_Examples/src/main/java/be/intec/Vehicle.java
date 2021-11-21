package be.intec;

class Vehicle {
    int x;

    Vehicle() {

        this(10);
    }

    Vehicle(int x) {

        this.x = x;
    }

}

class Car extends Vehicle {
    int y=30;

    Car() {
       super(20);//x = 10, y =0 (in the qeustion cannot super() and this in the same time because both have to in the first line )
       this.x=x;//x = 10, y =20
    }

    Car(int y) {
        super(y);

        this.y = y;
    }

    public String toString() {
        return super.x + " " + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println(y);
    }
}

