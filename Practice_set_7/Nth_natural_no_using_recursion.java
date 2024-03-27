package Practice_set_7;

import java.util.*;

public class Nth_natural_no_using_recursion {
    
    static int sum(int val){
        
        int sum = 0;

        for(int i = 0; i <= val; i++){
            sum = sum + i;
        }

        return sum;

    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number :- ");
        int number = input.nextInt();

        System.out.println(sum(number));

        input.close();

    }

}
