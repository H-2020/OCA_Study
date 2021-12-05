package questions_51_75;

public class Test59 {

    public static void main(String[] args) {
        String stuff ="TV";
        String res = null;

        if(stuff.equals("TV")){
            res="Walter";
        }else if(stuff.equals("Movie")){
            res="White";
        }else{
            res="No result";
        }
        System.out.println("Result ::"+res);
        res = stuff.equals("TV") ? "Walter" : stuff.equals("Movie") ? "White":"No Result";
        System.out.println("Result ::"+res);
    }
}
