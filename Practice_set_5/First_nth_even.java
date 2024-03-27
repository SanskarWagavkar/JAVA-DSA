package Practice_set_5;

import java.util.*;;

public class First_nth_even {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number = input.nextInt();

        for(int i = 0; i <= number; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        input.close();

    }
}
