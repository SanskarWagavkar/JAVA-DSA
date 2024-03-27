package Practice_set_1;

import java.util.*;

public class Km_to_miles {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the km :- ");
        float km = input.nextFloat();

        System.out.println("miles is :- "+km*0.621371);

        input.close();

    }
}
