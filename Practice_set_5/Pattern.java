package Practice_set_5;

import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number of Row :- ");
        int num = input.nextInt();

        for(int i = 1; i < num+1; i++){
            for(int j = 0; j <= num-i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        input.close();

    }
}
