package curso.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2027-09-28");
        LocalTime time = LocalTime.parse("18:30:15");
        LocalDateTime dateTime1 = date.atTime(time);
        LocalDateTime dateTime2 = time.atDate(date);

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

    }

}
