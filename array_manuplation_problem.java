package Array.problems;

public class array_manuplation_problem {
    public static void main(String[] args) {
        System.out.println("Finding 2nd largest number in the array");
        int [] array = {3,4,5,6,9};
        array[4] = 0;
        int largest = array[0];
        for (int i =1;i<array.length;i++){
            if (array[i]>largest){
                largest = array[i];
                System.out.println("Largest number among them is : " + largest +" "+ i);

            }

        }

        System.out.println("Largest number among them is : " + largest );

    }
}
