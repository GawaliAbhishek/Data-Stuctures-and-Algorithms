public class MaximumNumberofStringPairs {
    public static void main(String[] args) {
        String input[]={"cd","ac","dc","ca","zz"};
      System.out.println( maximumNumberOfStringPairs(input));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i =0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                System.out.println(words[i]);
                System.out.println(words[j]);
                if(helper(words[i],words[j]))
                count++;
            }
        }
        return count;
    }
    static boolean helper(String s1,String s2){
        if(s1.length()!=s2.length())
        return false;
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(s2.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public int countSeniors(String[] details) {
        if(details.length==0)
        return -1;
        int count=0;
        for(int i=0;i<details.length;i++ ){
            int age=details[i].charAt(12)+details[i].charAt(13);
            if(age>60)
            count++;
        }
        return count;
    }
}
