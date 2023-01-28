import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int arr[] = { 5,2,3,1,4 };
        Sort1(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort1(int arr[], int l, int h) {
        if (l >= h)
            return;

        int s = l;
        int e = h;
        int m = s + (e - s) / 2;
        int p = arr[m];

        while (s <= e) {
            while (arr[s] < p) {
                s++;
            }
            while (arr[e] > p) {
                e--;
            }

            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        Sort1(arr, l, e);
        Sort1(arr, s, h);

    }
}
