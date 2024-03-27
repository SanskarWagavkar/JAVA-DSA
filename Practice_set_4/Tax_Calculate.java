package Practice_set_4;

import java.util.*;

public class Tax_Calculate {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in INR :- ");
        
        float amount = input.nextFloat();
        float tax_amount = 0;

        if(amount >= 250000 && amount < 500000){
            tax_amount = (float) (amount*0.05);
            System.out.println("Tax Amount you paid :- "+tax_amount);
        }
        if(amount >= 500000 && amount <= 1000000){
            tax_amount = (float) (amount*0.20);
            System.out.println("Tax Amount you paid :- "+tax_amount);
        }
        if(amount > 1000000){
            tax_amount = (float) (amount*0.30);
            System.out.println("Tax Amount you paid :- "+tax_amount);
        }
        else if(amount < 250000){
            System.out.println("No need to Pay Tax");
        }

        input.close();

    }
}
