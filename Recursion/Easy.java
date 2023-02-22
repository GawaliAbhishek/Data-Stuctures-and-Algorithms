class Easy {
    public static void main(String[] args) {
        // System.out.println(numberodZeros(20003,0));
        System.out.println(powerofnum(3, 3));
    }

    static void printnum(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printnum(n - 1);
    }

    static void printnumRev(int n) {
        if (n == 0)
            return;

        printnumRev(n - 1);
        System.out.println(n);
    }

    static void printnumBoth(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        printnumBoth(n - 1);
        System.out.println(n);

    }

    static int powerofnum(int a,int b){
        if(b==0){
            return 1;
        }
        return a * powerofnum(a, b-1);
    }

    static int factorial(int n) {
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    static int sumofdigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumofdigits(n / 10);
    }

    static int productofdigits(int n) {
        if (n % 10 == n)
            return n;
        return n % 10 * productofdigits(n / 10);
    }

    static int numberodZeros(int n,int count){
        if(n==0)
        return count;
        
        if(n%10==0)
        count++;

        return numberodZeros(n/10, count);

    }
}