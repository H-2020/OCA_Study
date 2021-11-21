package be.intec;

public class Test {


    public static void main(String[] args) {

        String[][] chs = new String[2][];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = "" + i;
                i++;
            }

        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.println(c + "");
            }
            System.out.println();
        }


//        StringBuilder a = new StringBuilder("abc");
//        StringBuilder b = a.append("de");
//        b = b.append("f").append("g");
//        System.out.println("a=" + a);
//        System.out.println("b=" + b);
    }


//    public static void main(String[] args) {
//        int x = 5;
//        while (isAvailable(x)) {
//            System.out.print(x);
//            x--;
//        }
//    }
//    static Boolean isAvailable(int x){
//        return x>0 ? true :false;
//    }
//
//


//    static int count=0;
//    int i=0;
//
//    public void changeCount(){
//        while (i<5){
//            i++;
//            count++;
//        }
//    }
//
//    public static void main(String[] args) {
//        Test check1=new Test();
//        Test check2=new Test();
//        check1.changeCount();
//        check2.changeCount();
//        System.out.println(check1.count+":"+check2.count);
//
//
//
//    }
}
