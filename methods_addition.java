import java.util.*;
class a{
    int sum(int a ,int b){
        int ans = a+b;

        return ans;
    }
}

public class methods_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number : ");

        int x = sc.nextInt();
        System.out.println("enter the 2nd number : ");
        int y = sc.nextInt();

        System.out.println("The sum of given numbers are :");
        a haha = new a();
        System.out.println(haha.sum(x,y));









    }


}
