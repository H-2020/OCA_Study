package be.intec;
//2. What is the output of the following code?
class Mammal {

    public Mammal(int age) {
        System.out.print("Mammal");
    }

    public Mammal() {

    }
}

public class Platypus extends Mammal {

    public Platypus() {
        super();

        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
        new Platypus();
    }
}
