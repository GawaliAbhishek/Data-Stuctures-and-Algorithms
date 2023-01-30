import java.util.ArrayList;

public class Basics {

    public static void main(String[] args) {
        boolean arr[][]={{true,true,true},{true,true,true},{true,false,true}};
        System.out.println(NumberOfWaysWithObstracles2(0, 0, "", arr));
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
        // diagonal will be like r-1 and c-1 and after 1,1 we are not able to go
        // daigonaly
        if (r > 1 && c > 1)
            list.addAll(NumberOfWaysDiagonal(r - 1, c - 1, ans + "D"));
        if (r > 1)
            list.addAll(NumberOfWaysDiagonal(r - 1, c, ans + "V"));
        if (c > 1)
            list.addAll(NumberOfWaysDiagonal(r, c - 1, ans + "H"));
        return list;

    }

    // There is Obstracle at 1,1 we cannot go through 1,1
    // Here we start from 0,0 and we wanna go till 2,2
    public static ArrayList<String> NumberOfWaysWithObstracles(int r, int c, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if (r == 2 && c == 2) {
            list.add(ans);
            return list;
        }
        // if it is obstracle then just return from there
        if (r == 1 && c == 1) {
            return list;
        }

        if (r < 2) {
            list.addAll(NumberOfWaysWithObstracles(r + 1, c, ans + "D"));
        }
        if (c < 2) {
            list.addAll(NumberOfWaysWithObstracles(r, c + 1, ans + "R"));
        }
        return list;
    }

    // we have a Boolean 2d Array which contains a false from where we can not pass
    // using this we can find way when any of the cell in Array is obstracle
    // Here we start from 0,0 and we wanna go till 2,2
    public static ArrayList<String> NumberOfWaysWithObstracles2(int r, int c, String ans, boolean[][] maze) {
        ArrayList<String> list = new ArrayList<>();
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(ans);
            return list;
        }
        // if it is obstracle then just return from there
        if (!maze[r][c]) {
            return list;
        }

        if (r < maze.length - 1) {
            list.addAll(NumberOfWaysWithObstracles2(r + 1, c, ans + "D", maze));
        }
        if (c < maze[0].length - 1) {
            list.addAll(NumberOfWaysWithObstracles2(r, c + 1, ans + "R", maze));
        }
        return list;
    }

}
