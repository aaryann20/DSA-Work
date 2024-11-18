package recursion.java;
import java.util.*;

public class recursion_7 {

    public static int power(int p,int q){

        if(q==0) return 1;
        return power(p,q-1)*p;

    }
    public static void main(String Args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number :");
        int p = sc.nextInt();
        System.out.print("Enter the power :");
        int q = sc.nextInt();
        System.out.print(power(p,q));

    }
}
