package questions_1_25;

public class Test22 {

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int x = array.length;
//        while(x>0){
//            x--;
//            System.out.println(array[x]);
//        }


//        do {
//            x--;
//            System.out.println(array[x]);
//        } while (x > 0);
//    }

        while (x > 0) {
            System.out.println(array[--x]);
        }
    }
}
