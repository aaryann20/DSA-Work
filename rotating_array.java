package Array.problems;

public class rotating_array {
    static int[] arrayRotate(int array[], int i) {
        int n = array.length;
        i = i % n;
        int j = 0;
        int[] ans = new int[n];

        for (int a = n - i; a < n; a++) {
            ans[j++] = array[a];
        }
        for (int a = 0; a < n - i; a++) {
            ans[j++] = array[a];
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Rotating an array!");
        int arr_1[] = {23, 43, 54, 65, 76, 67};
        int[] rotatedArray = arrayRotate(arr_1, 1);

        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i]+" ");
        }
    }
}
