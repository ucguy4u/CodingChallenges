package dailycoding;

/**
 * You have an N by N board. Write a function that returns the number of
 * possible arrangements of the board where N queens can be placed on the board
 * without threatening each other, i.e. no two queens share the same row,
 * column, or diagonal.
 * 
 * @author ucguy4u
 */

public class NQueens {
    // define the numbers of queens
    final static int n = 4;

    public static void main(final String args[]) {
        NQueens obj = new NQueens();
        int[][] board = new int[n][n];
        obj.processBoard(board, 0);
        obj.isValid();

    }

    private boolean processBoard(int[][] board, int c) {
        if (c >= n)
            return true;
        for (int i = 0; i < n; i++) {
            
        }
        return false;

    }

    private boolean isValid() {
        System.out.println(n);
        return true;
    }
}