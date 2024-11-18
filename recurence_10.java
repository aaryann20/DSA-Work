package recursion.java;
import java .util.Scanner;
public class recurence_10 {
    public static int sum_alternate(int n){
        if(n==0) return 0;
        if(n%2==0){
           return sum_alternate(n-1)-n;
        }
        if(n%2!=0){
            return sum_alternate(n-1)+n;
        }
        return 0;
    }
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want sum as this alternate + - :");
        int a = sc.nextInt();
        System.out.print(sum_alternate(a));
    }
}
