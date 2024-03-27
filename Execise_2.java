import java.util.Random;
import java.util.Scanner;

public class Execise_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        Random ran = new Random();
        int x = ran.nextInt(3);

        String computer = "";

        if(x == 0){
            computer = "Stone";
        }
        if(x == 1){
            computer = "Paper";
        }
        if(x == 2){
            computer = "Sissor";
        }
        

        System.out.print("Enter Stone, Paper or Sissor :- ");
        String human = input.next();

        if(human.equals(computer)){
            System.out.println(computer);
            System.out.println("You Win");
        }
        else{
            System.out.println(computer);
            System.out.println("You Lose");
        }

        input.close();
    }
}
