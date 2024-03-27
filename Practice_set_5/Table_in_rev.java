package Practice_set_5;

import java.util.Scanner;

public class Table_in_rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number  = input.nextInt();

        for(int i = 10; i >= 1; i--){
            System.out.println(number*i);
        }
        input.close();
    }
}
