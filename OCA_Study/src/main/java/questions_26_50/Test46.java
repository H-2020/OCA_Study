package questions_26_50;

public class Test46 {

    static int count=0;
    int i=0;

    public void changeCount(){
        while (i<5){
            i++;
            count++;
        }
    }

    public static void main(String[] args) {

        Test46 check1=new Test46();

        Test46 check2=new Test46();
        //Test46 check3=new Test46();
        check1.changeCount();
        System.out.println(count);
        check2.changeCount();
        //check3.changeCount();
        System.out.println(check1.i+" "+check2.i);
        System.out.println(check1.count+" "+check2.count);
    }
}
