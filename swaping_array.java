package Array.problems;

public class swaping_array {
    static void swap_meatod_1(int a,int b) {
        System.out.println("original values : ");
        System.out.println("A :" + a);
        System.out.println("B :" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swaping : ");
        System.out.println("A :" + a);
        System.out.println("B :" + b);
    }

    static void swap_method2(int d,int f){
            System.out.println("original values D : " + d);
            System.out.println("original values F : " + f);
            d=d+f;
            f=d-f;
            d=d-f;
            System.out.println("Values after swaping : ");
            System.out.println("D :"+d);
            System.out.println("F :"+f);


        }



    public static void main(String[] args) {
        System.out.println("Swaping two terms in an array");
        int a= 9;
        int b= 3;
        int [] aa = {23,43,54,56};
        swap_meatod_1(3,4);
        swap_method2(45,32);



    }
}
