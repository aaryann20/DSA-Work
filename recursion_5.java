package recursion.java;
import java.util.*;

public class recursion_5 {

    public static int sum_of_digit(int n){
        if(n<=0 || n<=9) return n;

        int last_digit = n % 10;
        return sum_of_digit(n/10)+last_digit;

    }

    public static void main(String[] args) {
        System.out.print("Enter the number you want sum of digit of :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum_of_digit(n));


    }

}
