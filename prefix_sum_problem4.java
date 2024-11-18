package Array.problems;
import java.util.Arrays;
import java.util.Scanner;
public class prefix_sum_problem4 {
    public static int [] prefix_sum_init(int []arr){
        int n = arr.length;

        for (int i = 0;i<arr.length;i++){
            arr[i]= arr[i-1]+arr[i];
        }
        return arr;
    }
//    public static int [] suffic_sum(int []arr) {
//
//        int n = arr.length;
//        int sum = 0;
//        for (int i = 0 ; i<arr.length;i++){
//            sum +=arr[i];
//            for (int j = 1; j <( arr.length); j++) {
//                arr[j] = sum - (arr[j - 1] + arr[j]);
//
//            }
//
//        return arr;
//    }
    public static boolean equalsumpartation(int arr[]){
        int sum = 0;
        for (int i = 0 ; i<arr.length-1;i++) {
            sum += arr[i];
        }
        int prefix=0;
        for (int i =0;i<arr.length;i++){
            prefix+=arr[i];
            int suffixSum = sum-prefix;
            if (prefix==suffixSum){
                return true ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Q. Check if we can partition the array into two subarrays with equal sum. More\n " +
                "formally, check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array. ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        sc.nextLine();
//        int array[] = new int[size];
        System.out.println("Enter " + size+ " integer separated by spaces : ");

        String input = sc.nextLine();

        int array [] = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
//        int[] array = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        twopointer_array_problem_1.printarray(array);

        System.out.println("Equal sum partition possible : "+ equalsumpartation(array) );



    }
}
