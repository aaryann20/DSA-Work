package Array.problems;

public class reversing_array {
    static void swapinarray(int arr[],int i,int j){

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;


    }
    static void swaparray(int arr []){
        int i = 0;int j = arr.length-1;
       while (i<j){
           swapinarray(arr,i,j);
           i++;
           j--;
           for(int a =0;a<arr.length;a++){
               System.out.println(arr[a]);
           }


       }


    }
    public static void main(String[] args) {
        System.out.println("Here we would reverse the array!");
        int [] a = {1,2,3,4,5,6,7};
//        for (int i = (a.length-1);i>=0;i--)// USING FOR LOOP
//            System.out.print(a[i]+" ");

//        int i =(a.length-1);               //USING WHILE LOOP
//        int j =0;
//        while(i>=0){
//            i--;
//            System.out.print(a[i]+" ");
//    }
        swaparray(a);



    }
}
