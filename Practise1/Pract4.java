public class Pract4 {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(LinearSearch( arr,0,4));
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
}
