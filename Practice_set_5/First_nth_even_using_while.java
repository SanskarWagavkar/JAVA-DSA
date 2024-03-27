package Practice_set_5;

import java.util.Scanner;

public class First_nth_even_using_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number = input.nextInt();
        int i = 0;
        while (i <= number) {

            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        input.close();
    }
}
