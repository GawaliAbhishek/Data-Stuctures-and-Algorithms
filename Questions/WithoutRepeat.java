/*

https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest 
substring
 without repeating characters.
 */
public class WithoutRepeat {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
      StringBuilder builder=new StringBuilder();
      int max=0;
      builder.append(s.charAt(0));
      for(int i=1;i<s.length();i++){
        int sum=0;
        if(!builder.toString().contains(s.charAt(i)+"")){
            builder.append(s.charAt(i));
            sum=builder.length();
        }
        else{
            builder=new StringBuilder();
            sum=0;
        }
        if(sum>max)
         max=sum;
      }
      return max;
    }
}
