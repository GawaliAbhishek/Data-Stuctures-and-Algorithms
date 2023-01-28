import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int arr[] = { 5,1,3,2,4 };
      Sort2(arr, 0, arr.length);
      System.out.println(Arrays.toString(arr));
     // System.out.println(Sort1(arr));
    }

    public static int[] Sort1(int arr[]) {
        // if there is only one element left in array return the array
        if (arr.length == 1)
            return arr;
        // finding the mid to cut array in 2 parts
        int mid = arr.length / 2;

        // getting sorted array from left of mid and right of mid
        // this Arrays,copyOfRange() function makes another copy of array given in range

        int left[] = Sort1(Arrays.copyOfRange(arr, 0, mid));
        int right[] = Sort1(Arrays.copyOfRange(arr, mid, arr.length));

        // After getting both side sorted Array merging them to one
        return MergeHelp(left, right);

    }

    // Helper function to merge the arrays
    private static int[] MergeHelp(int[] left, int[] right) {
        // As ans array will have size left + right
        int ans[] = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // if any one of array is end stop the loop
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                ans[k] = left[i];
                i++;
            } else {
                ans[k] = right[j];
                j++;
            }
            k++;

        }

        // although if left array was not ended but right array was ended in above loop
        // now the entire left array as it is is supposed to merge so this
        while (i < left.length) {
            ans[k] = left[i];
            i++;
            k++;
        }
        // although if right array was not ended but left array was ended in above loop
        // now the entire right array as it is is supposed to merge so this

        while (j < right.length) {
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;
    }


    // INPLACE SORTING WITHOUT CREATING NEW ARRAYS AT EACH LEVEL
    public static void Sort2(int arr[], int s, int e) {
        if (e - s == 1)
            return;

        int m = s + (e - s) / 2;
        Sort2(arr, s, m);
        Sort2(arr, m, e);
        MergeInPlace(arr, s, m, e);

    }

    private static void MergeInPlace(int[] arr, int s, int m, int e) {

        int[] ans = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int k2 = 0; k2 < ans.length; k2++) {
            arr[s + k2] = ans[k2];
        }

    }

}
