package questions_1_25;

import java.time.LocalDate;

public class Date3 {

    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);
//        date= date.plusDays(10);
//        System.out.println(date);
    }
}
