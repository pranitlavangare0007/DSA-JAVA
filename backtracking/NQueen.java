package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

    public static boolean isSafe(char board[][], int row , int col){

        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=row-1 , j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] =='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] =='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nqueen(char board[][], int row, List<List<String>> result ) {

        if(row==board.length){
           List<String> temp = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }

            result.add(temp);
            return;
        }

        for(int j=0;j<board.length;j++){
           if(isSafe(board,row,j)){
             board[row][j]='Q';
            
            nqueen(board, row+1 ,result);
            board[row][j]='.';
           }
        }

    }

   

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char board[][]= new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        nqueen(board, 0,result);

        return result;
    }

     public static void print(char board[][]) {
        System.out.println("-----------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
       
    }
}
