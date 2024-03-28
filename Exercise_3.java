import java.util.Random;
import java.util.Scanner;

class Guess {
    Scanner input = new Scanner(System.in);
    Random ran = new Random();
    int chance = 10;
    int number = ran.nextInt(100);

    String guesses() {
        while (chance > 0) {
            System.out.println("Enter the Number :- ");
            int val = input.nextInt();

            if (number == val) {
                return "You Win";
            } else if (val > number) {
                System.out.println("This is Greater Number");
            } else if (val < number) {
                System.out.println("This is Lesser Number");
            }
            chance = chance - 1;
            System.out.println("Chances left: " + chance);
        }
        System.out.println("The Correct Number :- "+number);
        return "No Chance Left";
    }
}

public class Exercise_3 {
    public static void main(String[] args) {
        Guess g = new Guess();
        System.out.println(g.guesses());
    }
}
