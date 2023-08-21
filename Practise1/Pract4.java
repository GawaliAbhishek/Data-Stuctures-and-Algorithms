import java.util.Arrays;

public class Pract4 {
    public static void main(String[] args) {

        int arr[] = { 5, 3, 2, 4, 1 };
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // Fibonacii Serires in Recurrsion
    static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    // Binary Search in Recurrsion
    static int BinarySearch(int arr[], int s, int e, int key) {

        if (s > e)
            return -1;
        int mid = s + (e - s) / 2;

        if (arr[mid] == key)
            return mid;

        if (arr[mid] > key) {
            return BinarySearch(arr, s, mid - 1, key);
        } else {
            return BinarySearch(arr, mid + 1, e, key);
        }
    }

    // Linear Search Recurrsion
    static int LinearSearch(int arr[], int index, int key) {
        if (index == arr.length - 1)
            return -1;

        if (arr[index] == key)
            return index;

        return LinearSearch(arr, index + 1, key);
    }

    // Merge Sort
    static int[] MergeSort(int arr[]) {
        if (arr.length == 1)
            return arr;

        int arr1[] = MergeSort(Arrays.copyOfRange(arr, 0, (arr.length) / 2));
        int arr2[] = MergeSort(Arrays.copyOfRange(arr, (arr.length) / 2, arr.length));
        return Merge(arr1, arr2);
    }

    private static int[] Merge(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ans[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
            }
            k++;
        }

        if (i < arr1.length) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        if (j < arr2.length) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        return ans;
    }

    // Merge Sort in place
    static void MergeSortInPlace(int arr[], int s, int e) {
        if (e - s == 1)
            return;

        int mid = s + (e - s) / 2;
        MergeSortInPlace(arr, s, mid);
        MergeSortInPlace(arr, mid, e);

        MergeInplace(arr, s, mid, e);

    }

    private static void MergeInplace(int[] arr, int s, int mid, int e) {

        int i = s;
        int j = mid;
        int k = 0;
        int ans[] = new int[e - s];
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            ans[k] = arr[i];
            k++;
            i++;
        }
        while (j < e) {
            ans[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[s + l] = ans[l];
        }
    }

    static void QuickSort(int arr[], int l, int h) {

        if (l >= h)
            return;

        int s = l;
        int e = h;
        int p = (l + h) / 2;

        while (s <= e) {
            while (arr[s] < arr[p]) {
                s++;
            }

            while (arr[e] > arr[p]) {
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


            QuickSort(arr, l, e);
            QuickSort(arr, s, h);
    }
}
