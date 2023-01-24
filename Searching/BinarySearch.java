import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.toString(Binaryin2D(arr, 3)));
    }

    public static int Search1(int arr[], int key) {

        if (arr.length == 0)
            return -1;

        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                e = mid - 1;
            else
                s = mid + 1;
        }

        return -1;
    }

    public static int OrderAgonosticSearch(int arr[], int key) {

        int s = 0;
        int e = arr.length - 1;
        if (arr.length == 0)
            return -1;

        if (arr[0] < arr[arr.length - 1]) {

            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] < key)
                    s = mid + 1;
                else if (arr[mid] > key)
                    e = mid - 1;
                else
                    return mid;
            }
        } else {
            while (s <= e) {
                int mid = s + (e - s) / 2;
                if (arr[mid] < key)
                    e = mid - 1;
                else if (arr[mid] > key)
                    s = mid + 1;
                else
                    return mid;
            }

        }

        return -1;

    }

    // Matrix for this case is rowwise and column wise sorted 
    public static int[] Binaryin2D(int arr[][], int key) {
        if (arr.length == 0)
            return new int[] { -1, -1 };
        int s = 0;
        int e = arr.length - 1;
        while (s < arr.length && e >= 0) {
            if (arr[s][e] == key)
                return new int[] { s, e };
            else if (arr[s][e] > key) {
                e--;
            } else {
                s++;
            }
        }
        return new int[] { -1, -1 };
    }
}
