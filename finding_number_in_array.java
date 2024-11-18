package Array;
import java.util.*;
public class finding_number_in_array {
    public static void main(String[] args) {
        System.out.println("Finding maximum number in the array");
        int [] arr = {1,2,3,4} ;
        Scanner sc = new Scanner(System.in);
        System.out.println("give me the number you want to find in array : ");
        int a = sc.nextInt();
        int ans = a;
        for (int i = 0; i<4;i++){
            System.out.println(arr[i]);
            System.out.println("---------------------------------------------");
            if (arr[i]==a){
                System.out.println("We found your number at index " + i);

            }
            else {
                System.out.println("Not Found");
            }
        }


    }
}
