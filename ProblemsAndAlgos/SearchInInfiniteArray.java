public class SearchInInfiniteArray {
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
      System.out.println(SearchInfinate(arr, 17));
    }

    static int SearchInfinate(int arr[], int key) {

        int l = 0;
        int h = 1;
        while (arr[h] < key) {
            l = h;
            h = h * 2;
        }

        return Binary(arr, l, h, key);

    }

    private static int Binary(int[] arr, int l, int h, int key) {
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == key)
                return m;
            else if (arr[m] > key)
                h = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

}
