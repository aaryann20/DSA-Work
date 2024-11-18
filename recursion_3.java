package recursion.java;
import java.util.Scanner;
public class recursion_3 {
    public static int factorial(int n){

     if(n==0) return 1;
     int ans = factorial(n-1);
     int ab = n* ans;
      return ab;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want factorial of :");
        int n = sc.nextInt();
        System.out.println( factorial(n));
    }

}
