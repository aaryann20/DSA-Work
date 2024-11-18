package recursion.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class recursion_2 {
    static void recu(int n){

        if(n==1){
            System.out.print( n +" ");
            return;
        }
        System.out.print(n+" ");
        recu(n-1);

    }
    public static void main(String[] args) {
        System.out.println(" Print all natural number from the input number to 1 ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int n = sc.nextInt();
        recu(n);
    }
}
