
public class Fibonacii {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int z = 0;

        while (z <= 50) {
            System.out.println(z);
            x = y;
            y = z;
            z = x + y;

        }
    for (int i = 0; i < 11; i++) {
        System.out.println(fiboByFormula(i));
    }

    }


    // Formula was derived from recursive relation of fibo numbers
    static int fiboByFormula(int n){
       return (int) ( Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
