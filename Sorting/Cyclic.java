import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int arr[] = {2,9,8,5,7,3,1,4,6};
        Sort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort1(int arr[]) {
        if (arr.length == 0)
            System.out.println("Invalid Array");

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (correctIndex != i) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
