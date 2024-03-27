package Practice_set_4;

import java.util.*;

public class Marks {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Marks in Bio :- ");
        float bio = input.nextFloat();

        System.out.println("Enter the Marks in Phy :- ");
        float phy = input.nextFloat();

        System.out.println("Enter the Marks in Chem :- ");
        float chem = input.nextFloat();

        float all_sub = (((bio+chem+phy)/300)*100);

        if(all_sub > 40 && bio > 33 && chem > 33 && phy > 33){
            System.out.println(all_sub);
            System.out.println("Pass");
        }
        else{
            System.out.format("%0.2f",all_sub);
            System.out.println("Fail");
        }

        input.close();
    }
}
