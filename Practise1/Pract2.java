import java.util.Arrays;

public class Pract2 {

    public static void main(String[] args) {
       int data[][]={{},{},{}};

    }

    // Linear Search Algorithm
    static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Linear Search in 2D array

    static int[] LinearSearch2(int arr[][], int key) {
        if (arr.length == 0)
            return new int[] { -1, -1 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key)
                    return new int[] { i, j };
            }
        }

        return new int[] { -1, -1 };

    }

    // Binary Search Algorithm
    static int BinarySearch(int arr[], int key) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (arr[mid] == key)
                return mid;

            if (arr[mid] > key)
                j = mid - 1;
            else
                i = mid + 1;

        }
        return -1;
    }

    // bubble Sort
    static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Insertion Sort
    static void InsertionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j >= i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else
                    break;
            }
        }
    }

}
