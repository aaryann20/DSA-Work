package Array.problems;

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        System.out.println("find the number of triplets whose sum is taken input by the user ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want sum from triplets from given array : ");
        int sum= sc.nextInt();
        int [] array= {3,4,5,8,2,2};

        for (int i = 0; i<array.length;i++){
            for (int j =1; j<array.length;j++){
                for (int k = 2; k<array.length;k++){
                    if (array[i]+array[j]+array[k]==sum){
                        System.out.println("The triplets whose sum is = "+sum+" are : "+array[i]+" "+array[j]+" "+array[k]);
                    }
                }
            }
        }

    }
}
