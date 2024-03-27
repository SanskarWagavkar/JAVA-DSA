package Practice_set_7;

import java.util.*;

public class Table_using_method {

    public static void table(int val){

        for(int i = 1; i < 11; i++){
            System.out.println(val*i);
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number :- ");
        int number = input.nextInt();

        table(number);

        input.close();

    }
}
