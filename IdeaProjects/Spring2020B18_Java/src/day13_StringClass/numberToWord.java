package day13_StringClass;
/* write a java program that can convert any given numbers between 0~9 to words, if the number is greater

9 or less than0
Must use Scanner and Switch statement;
*/

import java.util.Scanner;
public class numberToWord {
    public static void main(String[] args) {

Scanner input=new Scanner(System.in);

        System.out.println("Enter number between 0~9");
        int num= input.nextByte();

        String result ="";

switch (num){
    case 0: result ="Zero";
    break;
    case 1: result="One";
    break;
    case 2: result="Two";
        break;
    case 3: result="Three";
        break;
    case 4: result="Four";
        break;
    case 5: result="Five";
        break;
    case 6: result="Six";
        break;
    case 7: result="Seven";
        break;
    case 8: result="Eight";
        break;
    case 9: result="Nine";
        break;
    default: result="Invalid";




}


        System.out.println(result);

String result2=(num==0)?"Zero":(num==1)?"one":(num==2)?"Two":(num==3)?"Three":(num==4)
        ?"Four":(num==5)?"Five":(num==6)?"Six":(num==7)?"Seven":(num==8)?"Eight":(num==9)?"Nine":"Invalid";

        System.out.println(result2);

















    }




















}
