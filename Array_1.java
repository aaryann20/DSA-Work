package Array;
class array_example{
    void array_1(){
        int [] Ages = new int[3];
        float [] weight = {1,23,34};//new float[3];// ONE D ARRAY
        int [][] hehe= new int [4][3];// 2 D ARRAY
        String [][] hoho = {{"Ram","Rakeh","Rohan"},{"Shubham","Sourabh","Sourya"},{"hey!", "hello", "goodmorning"}}; // 2 D ARRAY
        Ages [0] = 12;
        Ages [1] = 23;
        Ages [2] = 34;
//        Ages [3] = 54;
        System.out.println("One D arrays");
        System.out.println(Ages[0]);
        System.out.println(Ages[1]);
        System.out.println(Ages[2]);
//        System.out.println(Ages[3]);
//        weight [0]= 12.21f;
//        weight [1]= 13.22f;
//        weight [2]= 14.24f;
//        weight [3]= 15.25f;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        System.out.println("--------------------");
        System.out.println("Two D arrays");
//        System.out.println(weight[3]);
        System.out.println(hoho[0][0]);
        System.out.println(hoho[0][1]);
        System.out.println(hoho[0][2]);
        System.out.println(hoho[1][0]);
        System.out.println(hoho[1][1]);
        System.out.println(hoho[1][2]);
        System.out.println(hoho[2][0]);
        System.out.println(hoho[2][1]);
        System.out.println(hoho[2][2]);
        System.out.println("----------------");
        System.out.println("Length of the arrays");
        System.out.println(hehe.length);
        System.out.println(hoho.length);

    }
}
public class Array_1 {
    public static void main(String[] args) {
        System.out.println("Array Day 1 !");
//        int [] ages = new int [6];
//        ages [0]= 23;
//        ages [1]= 34;
//        ages [2]= 45;
//        ages [3]= 65;
//        ages [4]= 67;
//        ages [5]= 12;
//        System.out.println(ages[2]);
        array_example object_1 = new array_example();
        object_1.array_1();
    }
}
