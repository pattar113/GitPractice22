package day5_Unary_ShorthandOperators;

public class Divisiblity {

    public static void main(String[] args) {




        int number = 65;

        boolean divisibleBy2 = number % 2 == 0;

        boolean divisibleBy3 = number % 3== 0;
        boolean divisibleBy5 = number % 5 == 0;


        String result1 =  number + "is divisible by: 2"+ divisibleBy2;

        String result2 =  number + "is divisible by: 3"+ divisibleBy2;

        String result3 =  number + "is divisible by: 5"+ divisibleBy5;

        System.out.println(result1+"\n"+result2+"\n"+result3);   //concatenation ===> returns string;











        int number1 =  48;

        boolean divisibleBye2 = number1% 2 ==0;

        System.out.println(number1);
    }
















}
