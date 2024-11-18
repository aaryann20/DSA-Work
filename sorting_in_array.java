package Array;

public class sorting_in_array {
    public static void main(String[] args) {
        int [] arr = {12,9,46,23};
//        int a=0;
//        int b= arr.length;
        for (int i = 1; i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                int a,b;
                arr[i]= arr[i-1];
//                arr[i-1]=arr[i];



            }
            System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]);
        }
    }
}
