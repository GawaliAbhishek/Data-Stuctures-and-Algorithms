import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        int arr[] = {0,7,7,5,2,3,1,4,5,2,2,1,0,8,6};
        Selection(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    // pass r= number of row and c=0
    public static void P1(int r, int c) {

        if (r == 0)
            return;

        if (c < r) {
            System.out.print("*");
            P1(r, c + 1);
        } else {
            System.out.println();
            P1(r - 1, 0);
        }

    }

    // same code as P1 but the printing statements are written after the call
    // as the opposite pattren will be printed
    public static void P2(int r, int c) {

        if (r == 0)
            return;

        if (c < r) {
            P2(r, c + 1);
            System.out.print("*");
        } else {
            P2(r - 1, 0);
            System.out.println();
        }

    }

    // Bubble Sort using Recursion
    public static void Bubble(int arr[], int r, int c) {

        if (r == 0 || arr.length == 0)
            return;
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            Bubble(arr, r, c + 1);
        } else {
            Bubble(arr, r - 1, 0);

        }
    }

    // Selection Sort using Recursion
    public static void Selection(int arr[], int i, int j, int max) {

        if (i == 0 || arr.length == 0)
            return;

        if (j <= i) {
            if (arr[j] > arr[max])
                max = j;
            Selection(arr, i, j + 1, max);
        } else {
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            Selection(arr, i - 1, 0, 0);
        }

    }
}
