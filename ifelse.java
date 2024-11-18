import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        System.out.println("print the number which is divisible by 3 and even");
        System.out.println("enter a number :");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        for (int a = 0; a <= 10; a++) {

            if (a % 2 == 0 && a % 3 == 0) {
                System.out.println("the number is what you want.\n" +a);
            } else {
//                System.out.println("the number is NOT what you want."+a);
            }

        }
    }

}