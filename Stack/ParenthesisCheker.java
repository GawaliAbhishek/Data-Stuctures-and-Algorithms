import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisCheker {
    

    public static void main(String[] args) {
        System.out.println(parenthesisCheker("(()})[}"));
    }

    public static boolean parenthesisCheker(String s){

        Deque<Character> stack=new ArrayDeque<>();
        if(s.isEmpty())
        return false;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' ||s.charAt(i)=='{' ||s.charAt(i)=='[')
            stack.push(s.charAt(i));
            else{
                if(stack.isEmpty())
                return false;
                char top=stack.peek();
                if((top=='{' && s.charAt(i)=='}')|| (top=='[' && s.charAt(i)==']')||(top=='(' && s.charAt(i)==')'))
                stack.pop();
                else
                return false;
            }
        }

        if(stack.isEmpty())
        return true;
        else
        return false;
    }

}
