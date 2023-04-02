package Book.exceptions6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExceptionsMethods {

    public static void main(String[] args) {
         exception1();
        //exception2();
        //exception3();
    }

    static void exception1() {
        int a = 15;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException exception) {
            System.out.println("Exception:" + exception);
        }
        try {
            a = Integer.parseInt("Hallo");
            System.out.println("A is:" + a);
        } catch (NumberFormatException exception) {
            System.out.println("Exception:" + exception);
        }
    }

    static void exception2() {
        String[] Maanden = {"Januari", "Februari", "Mart", "April", "Mei"};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Maanden[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception:" + exception);
        }
    }

    static void exception3() {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        do {
            System.out.println("geef het nummer:");
            String str = null;
            try {
                str = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            double num = 0;
            try {
                num = Double.valueOf(str).doubleValue();
            } catch (Exception exception) {
                System.out.println("Exception" + exception);
                return;
            }
            if (num <= 0) {
                System.out.println("Nummer moet positief zijn");
                continue;
            }
            double oppervlakte = Math.PI * num * num;
            System.out.println("oppervlakte:" + oppervlakte);
            return;
        } while (true);

    }
}
