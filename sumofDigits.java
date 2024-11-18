import java.util.*;
public class sumofDigits {
    public static void main(String[] args) {
        System.out.print("give me a number and i will give you the sum of it's digit : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum_of_digits=0;
        while(number>0){

            sum_of_digits += number%10;
            number = number/10;

        }
        System.out.println("the sum of digits are :" + sum_of_digits);


    }
}


















