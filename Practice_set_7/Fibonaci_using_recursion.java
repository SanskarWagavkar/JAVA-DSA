package Practice_set_7;

import java.util.*;

public class Fibonaci_using_recursion {

    /* 
    static void fibo(int n){
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
            
        }
    }

    */

    static int fibo(int n){
        if(n == 1){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :- ");
        int num = input.nextInt();
        System.out.println(fibo(num));

        input.close();

    }
}
