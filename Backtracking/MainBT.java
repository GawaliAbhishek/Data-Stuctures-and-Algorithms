import java.util.*;

public class MainBT {
    public static void main(String[] args) {
        boolean arr[][] = { { true, true, true }, { true, true, true }, { true, true, true } };
        int path[][]=new int[arr.length][arr[0].length];
       NumberOfWaysAllPath2(0, 0, "", arr,path,1);
    }

    // Backtracking Thing
    public static ArrayList<String> NumberOfWaysAllPath(int r, int c, String ans, boolean[][] maze) {
        ArrayList<String> list = new ArrayList<>();
        // when we are at corner return ans
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(ans);
            return list;
        }
        // if it is visited then just return from there
        if (!maze[r][c]) {
            return list;
        }
        // mark the cell visited
        maze[r][c] = false;
    
        if (r < maze.length - 1) {
            list.addAll(NumberOfWaysAllPath(r + 1, c, ans + "D", maze));
        }

        if (r > 0) {
            list.addAll(NumberOfWaysAllPath(r - 1, c, ans + "U", maze));
        }
        if (c > 0) {
            list.addAll(NumberOfWaysAllPath(r, c - 1, ans + "L", maze));
        }
        if (c < maze[0].length - 1) {
            list.addAll(NumberOfWaysAllPath(r, c + 1, ans + "R", maze));
        }

        // while returing from the call 
        //restore the array make it true
        // for future calls 
        maze[r][c] = true;
        return list;
    }



    public static void NumberOfWaysAllPath2(int r, int c, String ans, boolean[][] maze,int path[][],int step) {
      
        // when we are at corner return ans
        if (r == maze.length - 1 && c == maze[0].length - 1) {
           path[r][c]=step;
           for(int arr[]:path){
            System.out.println(Arrays.toString(arr));
           }
           System.out.println();
           System.out.println(ans);
        }
        // if it is visited then just return from there
        if (!maze[r][c]) {
            return;
        }
        // mark the cell visited
        maze[r][c] = false;
        path[r][c]=step;
    
        if (r < maze.length - 1) {
          NumberOfWaysAllPath2(r + 1, c, ans + "D", maze,path,step+1);
        }

        if (r > 0) {
            NumberOfWaysAllPath2(r - 1, c, ans + "U", maze,path,step+1);
        }
        if (c > 0) {
           NumberOfWaysAllPath2(r, c - 1, ans + "L", maze,path,step+1);
        }
        if (c < maze[0].length - 1) {
            NumberOfWaysAllPath2(r, c + 1, ans + "R", maze,path,step+1);
        }

        // while returing from the call 
        //restore the array make it true
        // for future calls 
        maze[r][c] = true;
        path[r][c]=0;
  
    }
}
