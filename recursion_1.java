package recursion.java;
import java.util.Scanner;
public class recursion_1 {
    public static void printt(int n){
//        System.out.println( " Using Recusrion ");
        if(n==1){
            System.out.print(n+" ");
            return;


        } printt(n-1);
         System.out.print(n+" ");
    }
    public static void main(String[] Args){
        System.out.println("haha");
        Scanner sc = new Scanner(System.in);
        System.out.print("Give the input you want Out put for - ");
        int n = sc.nextInt();
        printt(n);
    }
}
