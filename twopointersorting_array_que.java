package Array.problems;

public class twopointersorting_array_que {
    public static void main(String[] args) {
        System.out.println("Given an array of integers 'a', move all the even integers at the beginning of the array followed by all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies the condition.-");
        int [] array ={1,2,3,4,5,6,9};
        int a = array.length-1;
        for (int i = 0 ;i<a;i++){
            for(int j = a;j>i;j--){
                if (array[i]%2!=0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                if (j<i){
                    break;
                }

            }
        }

        twopointer_array_problem_1.printarray(array);
        System.out.println(array.length);







        }
//
    }

