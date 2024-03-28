package Practice_set_7;

import java.util.*;

public class Pattern_using_recursion {

    static void pattern(int n){
         if (n>0) {
            pattern(n-1);
            
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println("");
         }
    }


    public static void main(String[] args) {
        pattern(5);
    }
}
