import java.util.*;
public class noOfDigit {

    public static void main(String[] args) {
        System.out.print("Enter a number and find the number of digits it have : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int number_of_digits ;
        int origonal_number= a;
        double r = 0.00;
        if(a==0){
            number_of_digits=1;

            System.out.println("it has 1 digit" + number_of_digits );
        }
        else{
            a = Math.abs(a);
            number_of_digits=0;
            while(a>0){
                a/=10;
                number_of_digits++;

            }

        }

        System.out.println("the number given is :\n" + origonal_number + " have " + number_of_digits +" digits");




    }
}
