package questions_1_25;

public class Test17 {
}

abstract class A3{
    private static int i;
    public void doStuff(){}
    public A3(){}
}

final class A1{
    public A1(){}
}

 class A2{
    private static int i;
    private A2(){}
 }

 class A4{
    protected static final int i = 0;//final oldugu icin initialize yapmak zorundayiz
    private void doStuff(){}
 }

 //final abstract olamaz
 abstract class A5{
    protected static int i;
    void doStuff(){}
     abstract void doIt();
 }

