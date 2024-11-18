package recursion.java;

import java.util.Scanner;
import java.util.ArrayList;

public class subsequene_1 {

    static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();

        // Base case: if the string is empty, return a list with an empty string
        if (s.length() == 0) {
            ans.add(""); // Add an empty string as a subsequence
            return ans;
        }

        // Recursive case: get all subsequences of the remaining string
        Character current_char = s.charAt(0);
        ArrayList<String> small_ans = getSSQ(s.substring(1));

        // Add subsequences without the current character and with the current character
        for (String ss : small_ans) {
            ans.add(ss); // Without current character
            ans.add(ss + current_char); // With current character
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Getting subsequences from the given string:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string you want subsequences of: ");
        String a = sc.nextLine();
        System.out.println(" "+getSSQ(a)+" ");
        sc.close();
    }
}
