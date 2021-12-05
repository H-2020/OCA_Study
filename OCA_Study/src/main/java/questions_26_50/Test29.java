package questions_26_50;

import java.time.LocalDate;

public class Test29 {

    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,01,32);//datetimeexception
        date.plusDays(10);
        System.out.println(date);
    }
}
