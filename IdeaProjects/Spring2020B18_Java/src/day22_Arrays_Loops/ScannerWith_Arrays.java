package day22_Arrays_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerWith_Arrays {
    public static void main(String[] args) {
      /*
       Task02:
        1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
                       use: Scanner,forLoop,forEachLoop,substring

       */


        Scanner scan=new Scanner(System.in);
        String []arr=new String[5];
        for(int i=0;i<arr.length;i++){

          arr[i] = scan.next();
        }

        System.out.println(Arrays.toString(arr));


for(String eachElement:arr){
  String str = eachElement.substring(0,3);
  String str1=eachElement.charAt(0)+""+eachElement.charAt(eachElement.length()-1);

    System.out.println(str);
    System.out.println("==============");
    System.out.println(str1);
}


    }
}
