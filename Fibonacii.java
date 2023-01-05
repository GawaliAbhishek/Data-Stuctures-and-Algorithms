
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

    }
}
