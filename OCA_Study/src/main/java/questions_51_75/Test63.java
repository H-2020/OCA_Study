package questions_51_75;

public class Test63 {

    public static void main(String[] args) {
        String names [] = {"Thomas","Petere","Joseph"};
        String pws [] = new String[3];
        int idx = 0;
        try{
            for (String n : names){
                pws[idx] = n.substring(2,6);
                idx++;
            }
        }catch (Exception e){
            System.out.println("Invalid Name");

        }
        for(String p:pws){
            System.out.println(p);
        }
    }
}
