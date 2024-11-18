package recursion.java;

import java.util.Scanner;

public class fibbonaci {

    public static int fibonacci(int n ){
        if(n==0) {System.out.print(0+" ");
    return 0;}
        int ans = n+fibonacci(n-1);
        System.out.print(ans+" ");
        return ans;

    }
    public static void main(String[] args) {


        System.out.print("Enter the number till you want fibbonacci series :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println( "    the sum till given number is :"+fibonacci(n));



    }
}
