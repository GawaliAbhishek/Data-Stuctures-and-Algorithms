import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class NextSmaller {

    public static void main(String[] args) {
        int arr[]={3,10,5,1,15,10,7,6};
        nextGreater(arr);
    }

    public static void nextSmaller(int arr[]) {

        Deque<Integer> stack=new ArrayDeque<>();
        List<Integer> list =new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek()>=arr[i])
            stack.pop();

            if(stack.isEmpty())
            list.add(-1);
            else
            list.add(stack.peek());

            stack.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void nextGreater(int arr[]){
        Deque<Integer> stack=new ArrayDeque<>();
        List<Integer> list =new ArrayList<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
            stack.pop();

            if(stack.isEmpty())
            list.add(-1);
            else
            list.add(stack.peek());

            stack.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
