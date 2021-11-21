package be.intec;

class MyString {
    String msg;

    MyString(String msg) {
        this.msg = msg;
    }
}

public class Q94 {
    public static void main(String[] args) {
        System.out.println("Hello" + new StringBuilder("Java Se 8"));
        System.out.println("Hello" + new MyString("Java SE 8").msg);
    }
}