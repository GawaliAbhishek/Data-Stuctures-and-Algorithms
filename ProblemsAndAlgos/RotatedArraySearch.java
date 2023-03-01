public class RotatedArraySearch {

    /*
     *The Array is Rotated Sorted means numbers are sorted when we rotate array
     * by some number
     */
    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 50, 60, 5, 10 };
        System.out.println(Search(arr, 30));
    }

    public static int Search(int arr[], int key) {
        int i = 0;
        int j = arr.length - 1;

        // Simple Binary Search Conditions
        while (i <= j) {
            int m = i + (j - i) / 2;
            if (arr[m] == key)
                return m;

            // if first element is less then middle means the first half of array
            // till the mid element is sorted     
            if (arr[i] <= arr[m]) {
                // if the given key lies in range of the strat and mid 
                // search space is right other wise next half is our search space
                if (arr[i] <= key && arr[m] >= key) {
                    j = m - 1;
                } else
                    i = m + 1;

            } // as left half of the Array is not sorted it means right half of the 
            // array is sorted definately
            else {

                if (arr[m] <= key && arr[j] >= key) {
                    i = m + 1;
                } else
                    j = m - 1;

            }
        }
        return -1;
    }
}
