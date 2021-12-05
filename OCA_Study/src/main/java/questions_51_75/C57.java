package questions_51_75;

class A{
    public void test(){
        System.out.println("a");
    }
}

class B extends A{
    public void test(){
        System.out.println("b");
    }
}
public class C57 extends A{
    public void test(){
        System.out.println("c");
    }

    public static void main(String[] args) {
        A b1=new A ();
        A b2=new C57 ();
        //b2=b1;
        b1=(A)b2;
       // A b3=(B) b2;//.ClassCastException
        b1.test();
        b2.test();
      // b3.test();

    }
}