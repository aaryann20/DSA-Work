package Array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        System.out.println(" Returning the smallest and tha largest value in the array ");

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number of element you want in array :");
        int input_size= sc.nextInt();
        int [] a = new int[input_size] ;
        for (int i =0;i<input_size;i++){
            System.out.println("Enter the "+ (i+1)+" Element : ");
            a[i] = sc.nextInt();

        }
        for (int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

        int smallest = a[0];
        for(int i = 0;i<a.length;i++){
            if (a[i]<smallest){
                smallest=a[i];
//                System.out.println("The smallest number among them is : "+ smallest);
            }else{


            }

        }



        System.out.println("The smallest number among them is : "+smallest);


    }
}
