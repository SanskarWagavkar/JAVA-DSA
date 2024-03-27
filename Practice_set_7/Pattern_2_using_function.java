package Practice_set_7;

import java.util.Scanner;

public class Pattern_2_using_function {

    static int pattern(int row){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < row-i; j++){
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
