package Array.problems;
import java.util.Arrays;
import java.util.Scanner;

public class twopointerarray_problem3 {



    public static void inputof_array_in_onrline(int arr[]){
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

    }
    static int[] sort_squares(int arr[]) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans[] = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {             //IMPORTANT STEP
                ans[k++] = arr[left] * arr[left];               //IMPORTANT STEP
                left ++;

            }
            else {
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Given an integer array 'a' sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.-" +
                "\nexample : [-10,-3,-2,1,4,5]");
//        int array_1[] = {-10,-3,-2,1,4,5};
        Scanner sc = new Scanner(System.in);

        // Taking array size as input
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character after size input

        // Taking array elements as input in one line
        System.out.println("Enter " + size + " integers separated by spaces:");
        String input = sc.nextLine();

        // Splitting the input and converting it to an integer array
        int[] array_1 = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();




        int ans [] = sort_squares(array_1);
//        reverse_array(ans);

        twopointer_array_problem_1.printarray(ans);
        int arra[]= {2,3,4,5,6,7,8};
        twopointer_array_problem_1.printarray(arra);


    }
}
