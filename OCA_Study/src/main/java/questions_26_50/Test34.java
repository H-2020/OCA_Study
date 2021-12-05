package questions_26_50;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Test34 {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 8, 31, 1, 1);
        dt.plusDays(30);
        //dt=dt.plusDays(30);
        dt.plusMonths(1);
        //dt=dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }
}