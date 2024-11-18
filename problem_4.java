package Array.problems;

public class problem_4 {
    public static void main(String[] args) {
        System.out.println("Given an array 'a' consisting of integers. Return the first value that is repeating in this array. If no value is being repeated, return -1.");
        int [] a = {2,4,36,23,65,21,23,65};
        for(int i = 0;i<a.length;i++){
            for (int j = i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    System.out.println(a[i]+" "+a[j]);

                }

            }

        }


    }
}
