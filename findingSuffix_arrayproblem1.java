package Array.problems;

import java.util.Arrays;
import java.util.Scanner;

public class findingSuffix_arrayproblem1 {
    public static int sumofarray(int arr[]){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum += arr[i];

        }
        System.out.println(sum);
        return sum;

    }

    public static  int [] prefix(int arr[]){

        for (int i =1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];

        }
//        reversing_array(arr);
        return arr;
    }
    public static int [] suffix(int arr[]){
        int total = sumofarray(arr);
        int n= arr.length;
        arr[0]= total;
        int ars[] =new int[n];
//        int j = 0 ;
         ars [n]= arr[n];
        for (int i = n - 2; i >= 0; i--) {
            ars[i] = ars[i + 1] + arr[i];
        }
        return ars;
        }
    public static int[] suffixx(int arr[]) {
        int n = arr.length;
        int[] suffixSum = new int[n];

        // Start with the last element, as the suffix sum of the last element is itself
        suffixSum[n - 1] = arr[n - 1];

        // Loop through the array from the second-last element down to the first
        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        return suffixSum;
    }


    public static void main(String[] args) {
        System.out.println("We are finding the suffix array of the given array ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array you want : ");
        int a = sc.nextInt();
        sc.nextLine();
//        int array[] = new int[size];
        System.out.println("Enter " + a+ " integer separated by spaces : ");
//        int [] array = new int[a];
        String input = sc.nextLine();

        int array [] = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//        int array [] = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//        sumofarray(array);
//        suffix(array);

        suffix(array);
//        System.out.println(suffix(array));
        twopointer_array_problem_1.printarray(array);

    }
}
