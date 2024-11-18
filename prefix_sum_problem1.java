package Array.problems;

import java.util.Arrays;
import java.util.Scanner;

public class prefix_sum_problem1 {
    public static int[] prefix_sum(int arr []){
        int n= arr.length;
        int [] pref = new int [n];
        pref [0] = arr[0];
         for (int i = 1;i<(arr.length);i++){
             pref [0] = arr[0];
             pref[i]=pref[i-1]+arr[i];
         }
         return pref;
    }
    public static void main(String[] args) {
        System.out.println("Prefix sum problem -1 : ");
        Scanner sc = new Scanner(System.in);

        // Taking array size as input
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character after size input

        // Taking array elements as input in one line
        System.out.println("Enter " + size + " integers separated by spaces:");
        String input = sc.nextLine();

        // Splitting the input and converting it to an integer array
        int[] array = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int pref [] = prefix_sum(array);
        twopointer_array_problem_1.printarray(array);
        twopointer_array_problem_1.printarray(pref);

    }
}
