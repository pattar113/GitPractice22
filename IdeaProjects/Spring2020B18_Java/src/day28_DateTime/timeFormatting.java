package day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeFormatting {
    public static void main(String[] args) {


        LocalTime time1 = LocalTime.of(16, 30);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(12,0);

        System.out.println(time2.format(dtf));

       boolean result1= time1.isAfter(time2);
        System.out.println(result1);



    }
}
