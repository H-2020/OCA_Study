package questions_51_75;

public class Test72 {

    public static void main(String[] args) {
        Caller c=new Caller();
        c.start();
        c.init();
    }
}
class Caller{
     void init(){ //private i silersek calisir
        System.out.println("initialized");
    }

     void start(){ //private i silersek calisir
        init();
        System.out.println("Started");
    }
}
