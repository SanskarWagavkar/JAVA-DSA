package Practice_set_6;
import java.util.*;
public class No_present_in_array_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Number :- ");
        int number = input.nextInt();

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        boolean flag = false;

        for(int i = 0; i < arr.length; i++){
            if(number == arr[i]){
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }

        input.close();
    }
}
