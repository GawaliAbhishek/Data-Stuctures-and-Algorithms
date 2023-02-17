/*
https://leetcode.com/problems/length-of-last-word/
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal 
substring
 consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
 * 
 */

public class LengthofLastWord {


    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }

    public static int lengthOfLastWord(String s) {
     String arr[]=s.split(" ");
     System.out.println(arr[arr.length-1]);
     return arr[arr.length-1].length();
    }
    
}
