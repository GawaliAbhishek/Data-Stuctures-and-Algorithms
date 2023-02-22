

// Debug the Program to understand it better
public class NQueenPrb {

    public static void main(String[] args) {
        int n=4;
        boolean[][]m=new boolean[n][n];
        System.out.println(queens(m, 0));
    }

    static int queens(boolean matrix[][],int row){
        if(row==matrix.length){
            display(matrix);
            System.out.println();
            return 1;
        }
        int count=0;

        // placing the queen and checking for every row and coloumn
        for(int col=0;col<matrix.length;col++){
            // place the queen if it is safe
            if(isSafe(matrix,row,col)){
                matrix[row][col]=true;
                count+=queens(matrix, row+1);
                matrix[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] matrix, int row, int col) {

        // for Staright up
        for(int i=0;i<row;i++){
            if(matrix[i][col])
            return false;
        }

        // for left diagonal
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){
            if(matrix[row-i][col-i])
            return false;
        }

        // for right diagonal
        int maxRight=Math.min(row,matrix.length-col-1);
        for(int i=1;i<=maxRight;i++){
            if(matrix[row-i][col+i])
            return false;
        }

        return true;
    }

    private static void display(boolean[][] matrix) {
        for(boolean arr[]:matrix){
           for(boolean e:arr){
            if(e)
            System.out.print("Q ");
            else
            System.out.print("X ");
           }
           System.out.println();
        }
    }
    
}
