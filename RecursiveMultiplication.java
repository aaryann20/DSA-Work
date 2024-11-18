package recursion.java;

//publ

public class RecursiveMultiplication {

    public static int multiply(int a, int b) {
        // Base case: if b is zero, return zero
        if (b == 0) {
            return 0;
        }

        // If b is negative, convert both numbers to positive
        if (b < 0) {
            return -multiply(a, -b);
        }

        // Recursive case: add 'a' to the result of multiplying 'a' by 'b-1'
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiply(a, b));
    }
}
