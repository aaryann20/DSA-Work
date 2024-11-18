package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class cloneing_in_array {
    public static void main(String[] args) {
        System.out.println("Cloneing array ");
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] wor = arr;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(wor[i]);
            System.out.println("-----------");


        }

        wor[0] = 0;
        wor[1] = 0;
        wor[2] = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println("-----------");
            System.out.println(arr[i]);
        }
        int[] huu = wor.clone();//MAKING CLONE OF ARRAY
        System.out.println(huu[0] + " " + huu[1] + " " + huu[2] + " " + huu[3] + " " + huu[4] + " " + huu[5]);

        System.out.println("_______________________________________________________________________");
        System.out.println("-----------------------------------------------------------------------");
        int[] object_1 = Arrays.copyOf(arr, arr.length);
        System.out.println(object_1);
    }
}
