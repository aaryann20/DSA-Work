package recursion.java;
import java.util.Scanner;
public class recursion_6 {
    public static int number_of_digits(int n){
        if(n<=0 || n<=9)
            return 1;
        int ans = 1;

       return number_of_digits(n/10) + ans;


    }
    public static void main(String[] args) {
        System.out.print("Enter the number you want to count the digits :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(number_of_digits(n));
    }
}
