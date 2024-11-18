package Array.two_darray.java;
import java.util.*;
public class multidimensational_array {
    public static void printarraymultid(int arr[][]){
        for(int i = 0;i<arr.length;i++){

            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println( );
        }

    }
    public static void main(String[] args) {
        System.out.println("MULTI-DIMENSIONAL ARRAY ");
//        int [][] array = new int[4][4];
//        int [][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
//        printarraymultid(array2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Printing an multi-d array ");
        System.out.println("Enter the number number of Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number number of Columns: : ");
        int c = sc.nextInt();
        int [][] array_1 = new int[r][c];
        System.out.println("Enter "+( r * c )+ " elements ");
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                array_1[i][j]= sc.nextInt() ;
            }
        }
        printarraymultid(array_1);

    }
}
