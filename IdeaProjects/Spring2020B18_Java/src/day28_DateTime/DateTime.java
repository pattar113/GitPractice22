package day28_DateTime;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateTime {

    public static void main(String[]args){
        LocalDateTime dt = LocalDateTime.now();
        LocalDate date = LocalDate.of(2020,3,20);

        LocalTime time = LocalTime.of(11,25,30);

        LocalDateTime dt2=LocalDateTime.of(date,time);
        System.out.println(dt2);

        LocalDateTime dateTime2 = LocalDateTime.of(2020,3,20,12,23,22);
        System.out.println(dateTime2);




        System.out.println(dt);

    }
}