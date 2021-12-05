package questions_1_25;

import java.util.ArrayList;

//Cycle is an abstract superclass of MotorCycle.
public abstract class Cycle4 {


}
class MotorCycle extends Cycle4{
    public static void main(String[] args) {
        ArrayList<Cycle4> myList=new ArrayList<>();
        myList.add(new MotorCycle());
    }
}

//Cycle is an interface that is implemented by the MotorCycle class.
//interface Cycle4{
//
//}
//class MotorCycle implements Cycle4{
//    public static void main(String[] args) {
//        ArrayList<Cycle4> myList=new ArrayList<>();
//        myList.add(new MotorCycle());
//    }
//}
