package Array.two_darray.java;

import java.util.Scanner;

public class multiplication_of_matrix {
    public static void matrixmulti(int a[][], int r1,int c1,int b[][],int r2,int c2){
        if (c1!=r2){
            System.out.println("Multiplication not valid !");
            return;
        }
        int [][] mul = new int [r1][c2];
        for (int i = 0;i<r1;i++){//row number
            for(int j =0;j<c2;j++){//column number
                for (int k = 0;k<c1;k++){
                    //mul[][]= i th row of a * j th column of b
                    mul[i][j]+=(a[i][k]*b[k][j]) ;
                }
            }
        }
        System.out.println("Multiplication of given 2 matrices is : ");
        multidimensational_array.printarraymultid(mul);

 
//        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Multiplication of two matrix ");


        Scanner sc = new Scanner(System.in);
//        System.out.println("Printing an multi-d array ");
        System.out.println("Enter the number number of Rows 1 : ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number number of Columns 1: : ");
        int c1 = sc.nextInt();
        int [][] array_1 = new int[r1][c1];
        System.out.println("Enter "+( r1 * c1 )+ " elements for matrix 1 ");
        for (int i = 0;i<r1;i++){
            for (int j = 0;j<c1;j++){
                array_1[i][j]= sc.nextInt() ;
            }
        }
        System.out.println("Enter the number number of Rows 2 : ");
        int r2 = sc.nextInt();
        System.out.println("Enter the number number of Columns 2 : : ");
        int c2 = sc.nextInt();
//        int [][] array_2 = new int[r2][c2];
//        System.out.println("Enter "+( r2 * c2 )+ " elements for matrix 1 ");
        int [][] array_2 = new int[r2][c2];
        System.out.println("Enter "+( r2 * c2 )+ " elements for matrix 2 ");
        for (int i = 0;i<r2;i++){
            for (int j = 0;j<c2;j++){
                array_2[i][j]= sc.nextInt() ;
            }
        }
        System.out.println("Matrix 1");
        multidimensational_array.printarraymultid(array_1);
        System.out.println("Matrix 2");
        multidimensational_array.printarraymultid(array_2);
//        System.out.println("The multiplication of the two matrix are : ");
        matrixmulti(array_1,r1,c1,array_2,r2,c2);
    }
}
