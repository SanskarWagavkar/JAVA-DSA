/* 
  
Input: N = 12345
Output: 5  
 
*/

import java.util.Scanner;

public class Count_Digits {

    static int count(int val){
        
        int number = val;
        int count = 0; 
        
        while(number > 0){
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number :- ");
        int number = input.nextInt();

        System.out.println(count(number));

        input.close();

    }
}
