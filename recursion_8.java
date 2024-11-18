package recursion.java;
import java.util.*;
public class recursion_8 {

    public static void multi(int a ,int b){

        if(b==0) return ;

        multi(a,b-1);

        System.out.print( (a*b)+" ");

    }
    public static void main(String Args[]){
        System.out.println("Enter the number you want multiples of ");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number :");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();
       multi(a,b);
    }
}
