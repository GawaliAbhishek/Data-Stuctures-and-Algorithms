import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {
       System.out.println(NumberOfWaysDiagonal(3, 3, ""));
    }

    // Number of ways to reach from (3,3) to (0,0) in a 3 X 3 Maze
    // R = Right D = Down
    public static int NumberOfWays(int r, int c) {
        // whenever we reach last column or row we have got one way return it
        if (r == 1 || c == 1) {
            return 1;
        }

        int count = 0;
        // number of ways if we go down
        count += NumberOfWays(r - 1, c);
        // number of ways if we go right
        count += NumberOfWays(r, c - 1);
        return count;

    }

    // Print all the Paths we can go through
    // we can add them in arrayList and return arraylist to
    public static void NumberOfWays(int r, int c, String ans) {
        // whenever we reach last column or row we have got one way return it
        if (r == 1 && c == 1) {
            System.out.println(ans);
            return;
        }
        if (r > 1)
            NumberOfWays(r - 1, c, ans + "D");
        if (c > 1)
            NumberOfWays(r, c - 1, ans + "R");

    }

    // Now let say we can Go V = Vertical and H = Horizontal and D = Diagonal
    public static ArrayList<String> NumberOfWaysDiagonal(int r, int c, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 && c == 1) {
            list.add(ans);
            return list;
        }

        if (r > 1 && c > 1)
            list.addAll(NumberOfWaysDiagonal(r - 1, c - 1, ans + "D"));
        if (r > 1)
            list.addAll(NumberOfWaysDiagonal(r - 1, c, ans + "V"));
        if (c > 1)
            list.addAll(NumberOfWaysDiagonal(r, c - 1, ans + "H"));
        return list;

    }

}
