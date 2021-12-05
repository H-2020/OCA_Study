package questions_26_50;

public class Test42 {

    public static void main(String[] args) {
        int[] stack={10,20,30};
        int size=3;
        int idx=0;

//        do{
//            idx++;
//        }while(idx>=size); // 1.elemani yani 20 yi yazar.


//        while (idx < size) {
//            idx++;
//        }       // ArrayIndexOutOfBoundsException Index 3 out of bounds for length 3

        do{
            idx++;
        }while(idx<size-1);


//        do{
//            idx++;
//        }while(idx<=size);  ArrayIndexOutOfBoundsException Index 4 out of bounds for length 3

//        while (idx <=size-1) {
//           idx++;
//       }                // ArrayIndexOutOfBoundsException Index 3 out of bounds for length 3

        System.out.println("The top element:"+ stack[idx]);
    }
}
