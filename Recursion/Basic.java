class Basic {
    public static void main(String[] args) {

        System.out.println(PowerOf(2, 2, 1));
    }

    // Print the Numbers
    static void Print(int n) {

        // base condition
        if (n == 10) {
            System.out.println(n);
            return;
        }

        // body of function
        System.out.println(n);

        // calling next call with n+1 value
        // This is tail Recursion as the calling is last statement of function
        Print(n + 1);
    }

    static int fibo(int n) {
        // base condtion
        if (n == 1 || n == 0)
            return n;

        // recursive relation fibo(n)=fibo(n-1)+fibo(n-2);
        // this is not a tail recursion as over all addtion return is last statement of
        // function
        return fibo(n - 1) + fibo(n - 2);
    }

    static int binarySearch(int arr[], int key, int s, int e) {
        // base condition that if s>e means array is over no element found
        if (s > e)
            return -1;

        // calc the mid index from given s and e
        int m = s + (e - s) / 2;

        // if element found return m;
        if (arr[m] == key)
            return m;

        // if it is in left side serach it in left by s ,e=m-1
        // return ans from left
        else if (arr[m] > key)
            return binarySearch(arr, key, s, m - 1);

        // if it is not in left means it in Right so serach it in right by s=m+1 ,e
        // return ans from right
        else
            return binarySearch(arr, key, m + 1, e);
    }

    // Find the Reverse of the given number
    static int ReverseNumber(int n, int rev) {

        // Base condition that if n==0 then rev has calc and return it
        if (n == 0)
            return rev;

        // Calc reverse at that pass
        rev = (rev * 10) + n % 10;

        // call other function which will find reverse of n/10
        return ReverseNumber(n / 10, rev);

    }

    static int PowerOf(int x, int y, int pro) {
        if (y == 0)
            return pro;

        pro = pro * x;

        return PowerOf(x, y - 1, pro);
    }

}