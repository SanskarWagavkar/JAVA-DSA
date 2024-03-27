import java.util.*;

public class Execise_1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Marks Outof :- ");
		int outof = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the Marks in Math :- ");
		int math = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the Marks in Science :- ");
		int science = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the Marks in SST :- ");
		int sst = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the Marks in English :- ");
		int english = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the Marks in Hindi :- ");
		int hindi = sc.nextInt();
		System.out.println();
		
		float sum = math+science+sst+english+hindi;
		
		float percentage = ((sum/(5*outof))*100);
		
		System.out.println("Percentage is :- "+percentage);

		sc.close();
		
	}
}
