import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {2,-5,3,-8,9,-1,0};
        Sort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort1(int arr[]) {
        if (arr.length == 0)
            System.out.println("Invalid Array");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else
                break;
            }

        }

    }
}
