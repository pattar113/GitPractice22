package day28_DateTime;

import java.time.LocalDate;

public class LocalDate_Practice {
    public static void main(String[] args) {
/*
WarmUp task:
	1. create an array of string, store five of your friends names in it
	2. create Array of localDates and store their birthdays in the same order
	3. use for loop to print out your friends' names and their birthdays
 */
String []friends={"John","Aron","Daniel"};
        LocalDate JohnBirthday=LocalDate.of(2020,3,5);
        LocalDate AronBirthday=LocalDate.of(2000,10,12);
        LocalDate DanielBirthday=LocalDate.of(2010,5,6);

        LocalDate[]Birthdays = {JohnBirthday,AronBirthday,DanielBirthday};

        for(int i =0;i<friends.length;i++){
        String name = friends[i];
        LocalDate bd = Birthdays[i];
            System.out.println(name+"'s Birthday is "+bd);
        }


    }
}
