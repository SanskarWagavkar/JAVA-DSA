package Array;

import java.util.*;

public class Inserting_element {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Count :- ");
        int count = input.nextInt();

        int arr[] = {1, 2, 3, 4};
        int arr2[] = new int[arr.length - 1 + count];

        // Copy elements from arr to arr2
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        // Add new elements to arr2 based on user input
        for (int i = arr.length; i < arr2.length; i++) {
            arr2[i] = input.nextInt();
        }

        // Print the elements in arr2
        for (int i : arr2) {
            System.out.println(i);
        }

        input.close();
    }
}
