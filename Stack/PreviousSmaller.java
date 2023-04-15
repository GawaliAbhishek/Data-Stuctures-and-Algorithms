import java.util.Stack;

public class PreviousSmaller {

    public static void main(String[] args) {
        int arr[]={4,10,5,8,20,15,3,12};
    previousgreater(arr);
    System.out.println();
    previoussmaller(arr);
    }

    public static void previoussmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i])
                stack.pop();

            if (stack.isEmpty())
                System.out.print("-1 , ");
            else
                System.out.print(stack.peek() + " , ");
            stack.push(arr[i]);
        }
        System.out.print("]");
    }

    public static void previousgreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i])
                stack.pop();

            if (stack.isEmpty())
                System.out.print("-1 , ");
            else
                System.out.print(stack.peek() + " , ");
            stack.push(arr[i]);
        }
        System.out.print("]");
    }

}
