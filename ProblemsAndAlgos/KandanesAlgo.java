/*
 * Maximum Subarray Quetsions Solution 
 */

class KandanesAlgo {
    public static void main(String[] args) {
        int arr[] = { -5, 4, 6, -3, 4, -1 };
        System.out.println(RealAlgo(arr));
    }

    static int RealAlgo(int arr[]) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxsum) {
                maxsum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxsum;
    }

    static int bruthforce(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > maxsum)
                    maxsum = sum;
            }
        }
        return maxsum;
    }

}