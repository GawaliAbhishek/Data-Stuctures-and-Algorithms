import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {

        subsetOfString("bbabcbcab", "");

    }

    // Prints all the subsets of given String
    public static void subsetOfString(String s, String ans) {
        // if String is empty means we have got the subset Print it
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        // 1st Charater
        char ch = s.charAt(0);
        // Take the charater
        subsetOfString(s.substring(1), ans + ch);
        // not take the charater
        subsetOfString(s.substring(1), ans);
    }

    // Adding the all subsets to a ArrayList
    public static ArrayList<String> subsetOfString1(String s, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if (s.isEmpty()) {
            list.add(ans);
            return list;
        }

        char ch = s.charAt(0);
        list.addAll(subsetOfString1(s.substring(1), ans + ch));
        list.addAll(subsetOfString1(s.substring(1), ans));
        return list;

    }

    // Passing ArrayList in Arguments
    public static ArrayList<String> subsetOfString2(String s, String ans, ArrayList<String> list) {
        if (s.isEmpty()) {
            list.add(ans);
            return list;
        }

        char ch = s.charAt(0);
        list.addAll(subsetOfString2(s.substring(1), ans + ch, list));
        list.addAll(subsetOfString2(s.substring(1), ans, list));
        return list;

    }

    // Including ACII Value of the charater
    public static ArrayList<String> subsetOfString3(String s, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if (s.isEmpty()) {
            list.add(ans);
            return list;
        }

        char ch = s.charAt(0);
        list.addAll(subsetOfString1(s.substring(1), ans + ch));
        list.addAll(subsetOfString1(s.substring(1), ans));
        list.addAll(subsetOfString1(s.substring(1), ans + (ch + 0)));
        return list;
    }

}
