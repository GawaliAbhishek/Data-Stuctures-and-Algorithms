import java.util.HashSet;
import java.util.Set;

/*

https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Given a string s, find the length of the longest 
substring
 without repeating characters.
 */
public class WithoutRepeat {


    public static void main(String[] args) {
        System.out.println(solution("aabcbc"));
    }

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder builder=new StringBuilder();
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1)
        return 1;
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


// leet code Solution

    private static int solution(String s){
        Set<Character>set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){
           
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);
                
            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }
            
        }
        return maxLength;
    }
}
