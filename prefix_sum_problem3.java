package Array.problems;

import java.util.Arrays;
import java.util.Scanner;

public class prefix_sum_problem3 {
    public static void printging_sum_usingprefixsum(int [] arr, int a,int b) {//    MY METHOD WITHOUT PREFIX SUM
        int sum = 0;
        for (int i = a-1; i <= b-1; i++) {
            sum = arr[i] + sum;
        }
        System.out.println(sum);
//        return sum;
    }
    public static int [] prefix_sum_init(int []arr){
        int n = arr.length;


        for (int i = 0;i<arr.length;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from 1 to r (both included).\n" +
                "Note: The values of 1 and r in queries follow 1-based indexing.");

        Scanner sc = new Scanner(System.in);

        // Taking array size as input
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character after size input

        // Taking array elements as input in one line
        System.out.println("Enter " + size + " integers separated by spaces:");
        String input = sc.nextLine();

        // Splitting the input and converting it to an integer array
        int[] array = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        twopointer_array_problem_1.printarray(array);
        printging_sum_usingprefixsum(array,2,4);






    }
}
