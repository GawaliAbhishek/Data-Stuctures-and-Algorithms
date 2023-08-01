public class Prac1 {
    public static void main(String[] args) {
        Pattren3(5);
        Pattren4(5);
    }

    // reverse a number
    static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // palindrome number
    static boolean palindromeNumber(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return n == rev;
    }

    // Prime Number
    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // ArmStrong Number
    static boolean armstrongNumber(int n) {
        int temp = n;
        int numOfDigit = (int) Math.log10(n) + 1;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            int pro = 1;
            for (int i = 0; i < numOfDigit; i++) {
                pro *= digit;
            }
            sum += pro;
            temp /= 10;
        }
        return sum == n;
    }

    // fibonacci number
    static void printFibonacii(int n) {
        int x = 0;
        int y = 1;
        int z = 0;

        while (z <= n) {
            System.out.println(z);
            x = y;
            y = z;
            z = x + y;
        }

    }

    // pattren printing Pattren 1
    static void Pattren1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // Pattren 2
    static void Pattren2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    // Pattren 3
    static void Pattren3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // pattern 4
    static void Pattren4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = n - 1; s > 1; s--)
                System.out.print(" ");
            for (int j = n; j >= i; j--)
                System.out.print("*");
            System.out.println();
        }
    }

}
