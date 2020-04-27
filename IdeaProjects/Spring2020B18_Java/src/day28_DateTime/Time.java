package day28_DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {


        LocalTime time1 = LocalTime.now();
        System.out.println(time1);


        LocalTime time2 = LocalTime.of(23, 30, 45);

        System.out.println(time2);

        LocalDateTime time3 = LocalDateTime.now();
        System.out.println(time3);

        LocalDateTime time4 = LocalDateTime.of(2020, 12, 23, 18, 25, 22);

        System.out.println(time4);

        LocalTime Saat = LocalTime.now();
        System.out.println(Saat);
       LocalTime Saat2=LocalTime.of(14,30);

        System.out.println(Saat2);


    }
}
