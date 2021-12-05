package questions_26_50;

public class Test38 {

    public static void main(String[] args) {

        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;

        for(int e:data){
            if(e!=key){
               // count++;
                continue;
              //  count++;  unreachable statement, compile error
            }
        }

        System.out.println(count+"Found");
    }
}
