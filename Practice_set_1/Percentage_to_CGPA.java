package Practice_set_1;

import java.util.Scanner;

public class Percentage_to_CGPA {
    
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
		
		double percentage = ((sum/(5*outof))*100);
		
        double cgpa = percentage/9.5;

		System.out.println("Percentage is :- "+percentage);

        System.out.println("Percentage is :- "+cgpa);

		sc.close();
		
    }

}
