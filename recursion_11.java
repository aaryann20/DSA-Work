package recursion.java;

import java.util.Scanner;

public class recursion_11 {
    public static int gcd(int a , int b)
    {
        if(b==0) return a;
//       while(a%b!=0){
//           int rem=a%b;
//           a=b;
//           b=rem;
//       }
//       return b;
//        gcd(a,a%b);
        return gcd(b,a%b);
    }
    public static void main(String Args[]){
     System.out.println("Find the greatest common divisor of given 2 numbers ");
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the 1st number :");
     int a = sc.nextInt();
     System.out.print("Enter the 2nd number :");
     int b = sc.nextInt();

     System.out.print(gcd(a,b));



    }
}
