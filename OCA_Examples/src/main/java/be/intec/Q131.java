package be.intec;

public class Q131 {
    static void readCard(int cardNo) throws Exception{
        System.out.println("Read card");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("Check card");
    }

    public static void main(String[] args) throws Exception{
        int cardNo=12344;
        Q131 ex = new Q131();
        ex.checkCard(cardNo);
        readCard(cardNo);
    }


//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder(5);//hier is capacity is 5
//        String s="";
//        if(sb.equals(s)){
//            System.out.println("Match 1");
//        }else if(sb.toString().equals(s.toString())){
//            System.out.println("Match 2");
//        }else{
//            System.out.println("No Match");
//        }
//    }

}
