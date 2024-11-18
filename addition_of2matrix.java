package Array.two_darray.java;

import java.util.Scanner;

public class addition_of2matrix {
    public static void addmatxix(int [][] a,int r1,int c1,int [][] b, int r2,int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("The input is invalid - Addition not possible !");
            return;
        }
        int sum [][]= new int[r1][c1];
        for(int i = 0;i<r1;i++){
            for (int j = 0;j<c1;j++){
                sum[i][j]= a[i][j]+b[i][j];
            }
        }
        multidimensational_array.printarraymultid(sum);

    }
    public static void main(String[] args) {
        System.out.println("Addition of two matrix ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Printing an multi-d array ");
        System.out.println("Enter the number number of Rows : ");
        int r = sc.nextInt();
        System.out.println("Enter the number number of Columns: : ");
        int c = sc.nextInt();
        int [][] array_1 = new int[r][c];
        System.out.println("Enter "+( r * c )+ " elements for matrix 1 ");
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                array_1[i][j]= sc.nextInt() ;
            }
        }
        int [][] array_2 = new int[r][c];
        System.out.println("Enter "+( r * c )+ " elements for matrix 2 ");
        for (int i = 0;i<r;i++){
            for (int j = 0;j<c;j++){
                array_2[i][j]= sc.nextInt() ;
            }
        }
        System.out.println("Matrix 1");
        multidimensational_array.printarraymultid(array_1);
        System.out.println("Matrix 2");
        multidimensational_array.printarraymultid(array_2);
        System.out.println("The sum of the two matrix are :");

        addmatxix(array_1,r,c,array_2,r,c);



    }
}
