package Practice_set_5;

import java.util.*;

public class Factorial_using_while_loop {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number = input.nextInt();

        int factorial = 1;

        while (number > 0) {

            factorial = factorial*number;
            number = number - 1;
        }
        System.out.println(factorial);

        input.close();

    }

}
