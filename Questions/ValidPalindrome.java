
/*
https://leetcode.com/problems/valid-palindrome/
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        String s1=s.toLowerCase();
        StringBuilder builder=new StringBuilder(s1);
        String s2=builder.reverse().toString();
        return s2.equals(s1);
    }
}
