package Practice_set_7;

import java.util.*;

public class Pattern_using_function {

    static int pattern(int row){
        for(int i = 1; i < row; i++){
            for(int j = 1; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return 0;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :- ");
        int number = input.nextInt();

        pattern(number);

        input.close();

    }
}
