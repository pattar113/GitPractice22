package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dateTime_Formatting {
    public static void main(String[] args) {

        LocalDateTime dateTime1 = LocalDateTime.of(2012,05,15,10,10,50);


        System.out.println(dateTime1);
        // 12/25/2015 11:30 am;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE,MM/dd/yyyy/ hh:mm a");
        String str =dateTime1.format(dtf);
        System.out.println(str);
        System.out.println(dateTime1.format(dtf));


    }
}
