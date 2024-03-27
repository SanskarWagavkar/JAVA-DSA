package Practice_set_4;

import java.util.*;

public class Leap_year {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Year :- ");
        int year = input.nextInt();

        if(year%400 == 0){
            System.out.println("It is Leap Year");
        }
        if(year%100 == 0){
            System.out.println("It is Not a Leap Year");
        }
        if(year%4 == 0){
            System.out.println("It is Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}
