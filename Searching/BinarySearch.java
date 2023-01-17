public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 4, 3, 2, 1, 0 };
        System.out.println(OrderAgonosticSearch(arr, 7));
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
}
