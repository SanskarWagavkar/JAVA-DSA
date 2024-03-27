package Practice_set_1;

import java.util.*;

public class Check_user_input {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        boolean no = input.hasNextInt();

        System.out.println(no);

        input.close();
    }
}
