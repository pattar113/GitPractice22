package day15_Forloop;

import java.util.Scanner;

public class PalindromeTest {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter your word");

        String word = input.nextLine();
        String reversWord="";


        for (int i = word.length()-1;i>=0;i--){

   reversWord+= word.charAt(i);

        }

        System.out.print(reversWord);

boolean palindrome= word.equalsIgnoreCase(reversWord);

        System.out.println(palindrome);


    }







}