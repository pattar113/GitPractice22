package day11_Scanner;
import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {

/*Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employed or not? true ==> employed, false ==> unemployed
    4. if he is employed , ask the salary
    4. if he is not employed set the salary to 0
    output:
        full name:
        employed status:
        salary:

 */
Scanner input=new Scanner(System.in);
        System.out.println("enter your first name: ");

String firstName=input.next();
        System.out.println("enter your last name: ");
        String lastName= input.next();

        String fullName=firstName+" "+lastName;
        System.out.println("your full name is: "+fullName);

        System.out.println("are you employed?");
        boolean employmentStatus=input.nextBoolean();

        double salary=0;
        if(employmentStatus==true){
            System.out.println("enter your salary: ");
            salary=input.nextDouble();
        }


        System.out.println("salary: "+salary);


        System.out.println("=================");














    }









}
