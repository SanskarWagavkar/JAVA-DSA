package Practice_set_5;

import java.util.Scanner;

public class Sum_table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number  = input.nextInt();

        int sum = 0;

        for(int i = 1; i < 11; i++){
            sum = sum + (number*i);
        }
        System.out.println(sum);
        input.close();
    }
}
