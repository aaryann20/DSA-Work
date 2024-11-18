import java.util.*;
public class poweraised {
    public static void main(String[] args) {
        System.out.println("B raised to power A");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A:");
        int A = sc.nextInt();
        System.out.print("Enter the value of power B:");
        int B = sc.nextInt();
        for(int i = 0;i<B-1;i++){
            A*=A;
        }
        System.out.println(A);
    }
}
