package curso.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(22, 2, 12);
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTimeNow);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }

}
