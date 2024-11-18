package recursion.java;
public class recusrion_9 {
    public static int sumof_n(int n){
        if(n==0) return 0;
        return sumof_n(n-1) + n;
    }
     public static void main(String Args[]){

         System.out.print("Sum of n numbers :");
         System.out.print(sumof_n(4));
     }
}
