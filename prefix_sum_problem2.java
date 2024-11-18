package Array.problems;

import java.util.Arrays;
import java.util.Scanner;

public class prefix_sum_problem2 {
    public static int [] prefix_sum_init(int []arr){
        int n = arr.length;


        for (int i = 1;i<arr.length;i++){
            arr[i]= arr[i-1]+arr[i];

        }
        return arr;

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
        twopointer_array_problem_1.printarray(array);
        prefix_sum_init(array);
        twopointer_array_problem_1.printarray(array);





    }
}
