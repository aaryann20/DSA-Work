package Array.two_darray.java;
class Solution {
    public static void twoSum(int[] nums, int target) {
        int sum = 0;
        int ans[];
        for (int i = 0; i < nums.length; i++) {
            for (int j = (nums.length - 1); i >= 0; i--) {
                if (nums[i] + nums[j] == target) {
//                    int [] ans ={i,j};

                }

            }
        }
//        return ans;

    }
public static int sumarray(int arr[]){
        int sum = 0;
        for (int i = 0;i<arr.length;i++){
            sum = arr[i]+sum;
        }
        return sum;
}


    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        twoSum(a,3);


    }

}
