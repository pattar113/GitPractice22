package OfficeHours.Practice_04_01_2020;

import java.util.Arrays;

public class NestedLoop2 {
    public static void main(String[] args) {


        int [][]numbers={
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };
        // print all the odd numbers with regular for loop, Must use continue statement

        for(int j=0;j<numbers.length;j++){
            for(int i=0;i<numbers[j].length;i++){
                if(numbers[j][i] %2==0){
                    continue;
                }
                System.out.println(numbers[j][i]);
            }
        }


for(int[] each1DArray:numbers){

    for(int eachElement:each1DArray){
        if(eachElement %2==0){
            continue;
        }
        System.out.print(eachElement);
    }

}
    }
}
