package Array.problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class twopointer_array_problem_1 {
    public static void printarray(int arr[]){
        for (int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void sort_array_of01(int arr[]){
        int n = arr.length;
        //
        int a = 0;
        for (int i = 0; i<arr.length;i++){
            if (arr[i] == 0){
                a+=1;
            }
        }
        for (int i = 0 ; i < a ; i++){
            System.out.print(0+" ");
        }
        for (int i = 0;i<=n-a;i++){
            System.out.print(1+" ");
        }
    }
    static void arrayswap(int arr[] , int i,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        System.out.println(" Now we will use 2 pointer method in Binary Array sorting -");
//        int [] array = {1,0,0,1,1,0,0,1,1,0};
        int [] array = {0,0,1,0,1,0};
        int a = (array.length-1);
        for(int i = 0;i<a;i++){
            for (int j = a;j>i;j--){
                if (array[i]==1){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;

                }
                if(j<i){
                    break;
                }



            }

        }


        printarray(array);




    }
}





//        System.out.println(" Array of 0 1 sorting ");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array [] you want : ");
//        int a = sc.nextInt();
//        System.out.println("Enter the 1st element : ");
//        int [] array = new int[a];
//        for (int i = 0;i<a;i++){
//            System.out.println("Enter the "+(i+1)+" element of array : ");
//            array[i] = sc.nextInt()  ;
//        }
//        sort_array_of01(array);
//        printarray(array);