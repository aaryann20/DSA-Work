package Array;
import java.util.Scanner;

public class taking_input_in_array {

    static void printarr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Taking input in array in Java");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of inputs you want to give in the array: ");
        int a = sc.nextInt();
        sc.nextLine();  // Consume newline left-over

        String[] herm = new String[a];

        for (int i = 0; i < herm.length; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            herm[i] = sc.nextLine();
        }

        System.out.println("Original array:");
        printarr(herm);

        String[] arr2 = herm;
        System.out.println("Duplicate array created:");
        printarr(arr2);
    }
}
