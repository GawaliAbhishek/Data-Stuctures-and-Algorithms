import java.util.ArrayList;

public class Permutaions {

    public static void main(String[] args) {
      P1("abcd", "");
    }

    // Priting all the permutaions
    public static void P1(String s, String ans) {
        // base condition
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // removing 1st char
        char ch = s.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            // first end of Answer String
            // say if ans is ab then it may be _ or a accoring to i
            String f = ans.substring(0, i);
            // last end of the answer String
            // say is ans is ab then it may be _b
            // debug this to understand this more deep
            String l = ans.substring(i, ans.length());
            P1(s.substring(1), f + ch + l);
        }
    }

    // Returning ArrayList but by passing it in Arguments
    public static ArrayList<String> P2(String s, String ans, ArrayList<String> list) {
        // base condition
        if (s.isEmpty()) {
            list.add(ans);
            return list;
        }
        // removing 1st char
        char ch = s.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            // first end of Answer String
            // say if ans is ab then it may be _ or a accoring to i
            String f = ans.substring(0, i);
            // last end of the answer String
            // say is ans is ab then it may be _b
            // debug this to understand this more deep
            String l = ans.substring(i, ans.length());
            P2(s.substring(1), f + ch + l, list);
        }
        return list;
    }

   // Returing ArrayList but By Creating the ArrayList at every Recurion Call
    public static ArrayList<String> P3(String s, String ans) {
        ArrayList<String> list =new ArrayList<>();
        // base condition
        if (s.isEmpty()) {
            list.add(ans);
            return list;
        }
        // removing 1st char
        char ch = s.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            // first end of Answer String
            // say if ans is ab then it may be _ or a accoring to i
            String f = ans.substring(0, i);
            // last end of the answer String
            // say is ans is ab then it may be _b
            // debug this to understand this more deep
            String l = ans.substring(i, ans.length());
           list.addAll( P3(s.substring(1), f + ch + l));
        }
        return list;
    }

    // counting the number of Permutaions
    // making count in function it self
    public static int P4(String s, String ans) {
        // base condition
        if (s.isEmpty()) {
           // whenever w get s empty one ans has been found
            return 1;
        }
        // removing 1st char
        char ch = s.charAt(0);
        // count =0 
        int count=0;
        for (int i = 0; i <= ans.length(); i++) {
            // first end of Answer String
            // say if ans is ab then it may be _ or a accoring to i
            String f = ans.substring(0, i);
            // last end of the answer String
            // say is ans is ab then it may be _b
            // debug this to understand this more deep
            String l = ans.substring(i, ans.length());
            // adding the number of ans
          count+= P4(s.substring(1), f + ch + l);
        }
        return count;
    }
}
