/*

https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest 
substring
 without repeating characters.
 */
public class WithoutRepeat {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
     
        int sum=0;
        int maxsum=0;
        String sub="";

        for (int i = 0; i < s.length()-1; i++) {
            if(isThere(sub,s.charAt(i))){
                sub+=s.charAt(i);
                sum++;
            }
            else{
                sum=0;
                sub="";
            }
            if(sum>maxsum)
            maxsum=sum;
        }
        return maxsum;
    }

    private static boolean isThere(String s,char ch){
       for(char c:s.toCharArray()){
        if(c==ch)
        return false;
       }
       return true;
    }
}
