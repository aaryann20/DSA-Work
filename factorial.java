//import haha.hum.app;

import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.print("Finding factorials of the number : ");
        Scanner sc = new Scanner(System.in);
        int factorial;
//        app object = new app();
        int number = sc.nextInt();
//        factorial = factorial(n-1)*n;
       factorial=1;
       for(int i = 1;i<=number;i++){
           factorial = factorial * i;


       }
        System.out.println(factorial);









    }
}
