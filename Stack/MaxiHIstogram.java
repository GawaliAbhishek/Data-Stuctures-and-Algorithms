import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class MaxiHIstogram {
    // https://www.geeksforgeeks.org/largest-rectangular-area-in-a-histogram-using-stack/
    // https://leetcode.com/problems/largest-rectangle-in-histogram/description/
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 5, 6, 3, 2, 4, 2 };
        usingStack(arr);
    }

    public static void BruthForce(int arr[]) {
        int maxArea = -1;
        for (int i = 0; i < arr.length; i++) {
            int left = i;
            int right = i;

            while (left >= 0 && arr[left] >= arr[i])
                left--;
            while (right < arr.length && arr[right] >= arr[i])
                right++;

            int area = (right - left - 1) * arr[i];
            if (area > maxArea)
                maxArea = area;
        }

        System.out.println(maxArea);
    }

    public static int usingStack(int arr[]) {
        int maxAns = 0;
        int[] ps = previoussmaller(arr);
        int ns[] = nextSmaller(arr);

        // System.out.println(Arrays.toString(ps));
        // System.out.println(Arrays.toString(ns));
        for (int i = 0; i < arr.length; i++) {
            int area = (ns[i] - ps[i] - 1) * arr[i];
            maxAns = Math.max(maxAns, area);
        }

        return maxAns;

    }

    private static int[] nextSmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for (int index = arr.length - 1; index >= 0; index--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[index])
                stack.pop();

            if (stack.isEmpty())
                ans[index] = arr.length;
            else {
                ans[index] = stack.peek();
            }
            stack.push(index);
        }

        Collections.reverse(Arrays.asList(ans));
        return ans;
    }

    private static int[] previoussmaller(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[index])
                stack.pop();

            if (stack.isEmpty())
                ans[index] = -1;
            else {
                ans[index] = stack.peek();
            }
            stack.push(index);
        }
        return ans;
    }
}
