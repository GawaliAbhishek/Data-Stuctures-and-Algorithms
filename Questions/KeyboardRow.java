import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*https://leetcode.com/problems/keyboard-row/
 *Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm" 
 */
public class KeyboardRow {
    public static void main(String[] args) {
        String[] arr = { "Hello", "Alaska", "Dad", "Peace" };
        System.out.println(Arrays.toString(findWords(arr)));
    }

    public static String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        String wch1 = "qwertyuiop";
        String wch2 = "asdfghjkl";
        String wch3 = "zxcvbnm";

        for (String s : words) {

            String s1 = s.toLowerCase();
            String wch;
            boolean isFound = false;
            char ch = s1.charAt(0);

            if (wch1.contains(ch + ""))
                wch = wch1;
            else if (wch2.contains(ch + ""))
                wch = wch2;
            else
                wch = wch3;

            for (int i = 1; i < s1.length(); i++) {
                if (!wch.contains(s1.charAt(i) + "")) {
                    isFound = true;
                    break;
                }

            }

            if (!isFound)
                ans.add(s);

        }

        return ans.toArray(new String[0]);

    }
}
