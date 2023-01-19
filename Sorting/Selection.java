import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 2, 7, 8, 3, 4, 9, 0,4,3,2,9,7,5,4,7,0,1,2 };
        Sort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort1(int arr[]) {

        if (arr.length == 0)
            System.out.println("Invalid Array");

        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = indexOfMaxInArray(arr, 0, last);
            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

    }

    private static int indexOfMaxInArray(int arr[], int start, int end) {
        if (start < 0 || end > arr.length)
            return -1;

        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex])
                maxIndex = i;

        }
        return maxIndex;
    }

}
