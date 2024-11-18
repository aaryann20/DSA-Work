package Array.problems;

public class problem_1 {
    public static void main(String[] args) {
        System.out.println("Find the number of pair in the given array whose sum is 7 ");
        System.out.println("");
        System.out.println("GIVEN ARRAY");
        int [] array_1 ={2,5,3,4,7,0,6,1};
        for (int i = 0;i<array_1.length;i++){
            for (int j = 1; j<array_1.length;j++){
                if (array_1[i]+array_1[j]==7){
                    System.out.println("The number with which it would make sum as 7 : "+array_1[i] +" "+array_1[j]);
                }

            }
        }

    }
}
