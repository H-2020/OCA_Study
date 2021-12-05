package questions_51_75;

public class Test69 {

    public static void main(String[] args) {
        int ans=1;//ben ekledim
        try{
            int num=10;
            int div=0;
            ans=num/div;
        }catch(ArithmeticException ae){
            ans=0;
            System.out.println(ans);
        }catch(Exception e){
            System.out.println("invalid calculation");
        }
       System.out.println("Answer= "+ ans);
    }
}
