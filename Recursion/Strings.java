

public class Strings {
    public static void main(String[] args) {
        String s="abba";
        System.out.println(Palindrome(s,0,s.length()-1));
    }

    // remove some charater from string using recursion
    // Using Ans passing in Arrugemts
    public static String Question1(String q,String ans){

        if(q.isEmpty())
        return ans;

        char ch=q.charAt(0);
        if(ch=='a'){
           return  Question1(q.substring(1), ans); 
        }else{
           return  Question1(q.substring(1), ans+ch);
        }
    }
    
    // By using Approch not passing the Answer String as Arguments
    public static String Question1(String q){
       
        if(q.isEmpty())
        return "";

        char ch=q.charAt(0);
        if(ch=='a'){
         return ""+Question1(q.substring(1));
        }
        else{
        return ch+Question1(q.substring(1));
        }
    }


    // Skiping the Entire String say apple from given String
    public static String Question2(String q){
        if(q.isEmpty())
        return "";

        if(q.startsWith("apple")){
            return Question2(q.substring(5));
        }
        else{
            return q.charAt(0)+Question2(q.substring(1));
        }
    }

    // Skiping the app when it is not the part of apple
    public static String Question3(String q){
        if(q.isEmpty())
        return "";

        if(q.startsWith("app") && !q.startsWith("apple")){
            return Question3(q.substring(3));
        }
        else{
            return q.charAt(0)+Question3(q.substring(1));
        }
    }


    // Palindrome String by Recurrsion
    public static boolean Palindrome(String s,int p1,int p2){
        if(p1>=p2){
            return true;
        }

        if(s.charAt(p1)!=s.charAt(p2))
        return false;
        
        return Palindrome(s, p1+1, p2-1);

        
    }
}
