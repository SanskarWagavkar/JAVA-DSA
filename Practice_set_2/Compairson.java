package Practice_set_2;
import java.util.*;

public class Compairson {
    public static void main(String[] args) {
        int given = 8;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number :- ");
        int num = input.nextInt();

        System.out.println(num>given ? "Greater":"Not Greater");

        input.close();
    }
}
