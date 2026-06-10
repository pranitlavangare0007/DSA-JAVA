package backtracking;

import java.util.Arrays;

public class knightTour {

    static int[] dx = { -2, -2, -1, -1, 1, 1, 2, 2 };
    static int[] dy = { -1, 1, -2, 2, -2, 2, -1, 1 };

    public static boolean checkValidGrid(int[][] grid) {
        int n = 5;
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], -1);
        }

        board[0][0] = 0;

        if (solve(0, 0, 1, board, n) == true) {
            return true;
        }

        return false;

    }

    public static boolean solve(int row, int col, int moves, int[][] board, int n) {

        if (moves == n * n) {
            return true;
        }

        for (int i = 0; i < 8; i++) {

            int nextRow = row + dx[i];
            int nextCol = col + dy[i];

            if(isSafe(nextRow , nextCol , board , n)){

                board[nextRow][nextCol]=moves;

                if(solve(nextRow, nextCol, moves+1, board, n)){
                    return true;
                }
                board[nextRow][nextCol]=-1;

            }
        }
        return false;

    }

    public static boolean isSafe(int nextRow, int nextCol, int[][] board, int n) {
       
        return nextRow >= 0 &&
                nextRow <n &&
                nextCol >= 0&&
                nextCol < n &&
                board[nextRow][nextCol]==-1;
    
    }

}
