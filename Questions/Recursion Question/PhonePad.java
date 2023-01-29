import java.util.ArrayList;
import java.util.List;

/*
 * 17. Letter Combinations of a Phone Number
Given a string containing digits from 2-9 inclusive, return all possible letter 
combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. 
Note that 1 does not map to any letters.
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

 */

public class PhonePad {

    public static void main(String[] args) {
        System.out.println(Combinations2("12", ""));
        // System.out.println('a'+0);

    }

    public static void Combinations(String s, String ans) {
        // base condition
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // convert char to int using unicode or ascii value
        int n = s.charAt(0) - '0';

        // this range is to get abc for 1 def for 2 etc
        for (int i = (n - 1) * 3; i < n * 3; i++) {
            char ch = (char) ('a' + i);
            // getting that char and addingt to answer and calling next Call
            Combinations(s.substring(1), ans + ch);
        }

    }

    public static List<String> Combinations2(String s, String ans) {
        // base condition
        if (s.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        // convert char to int using unicode or ascii value
        int n = s.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        // this range is to get abc for 1 def for 2 etc
        for (int i = (n - 1) * 3; i < n * 3; i++) {
            char ch = (char) ('a' + i);
            // getting that char and addingt to answer and calling next Call
            list.addAll(Combinations2(s.substring(1), ans + ch));
        }
        return list;

    }

    
}
