public class StringSearch {
    public static void main(String[] args) {
        String s = "Abhishek";
        System.out.println(Search(s, 'o'));
    }

    public static boolean Search(String s, char ch) {
        if (s.length() == 0)
            return false; 
        for (char c : s.toCharArray()) {
            if (c == ch)
                return true;
        }
        return false;

    }


    public static boolean Search1(String s, char ch) {
        if (s.length() == 0)
            return false;

      
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==ch)
            return true;
        }
        return false;

    }

}
