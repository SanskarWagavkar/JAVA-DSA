package Practice_set_5;
import java.util.*;;


public class Table_of_given_number {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int number  = input.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(number*i);
        }
        input.close();

    }
}
