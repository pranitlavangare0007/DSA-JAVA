package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixII {

    public static int[][] spriralII(int n){
       
        int[][] matrix= new int[n][n];

        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;
        int add=1;

        while(rowStart <= rowEnd && colStart <= colEnd){

        

       for(int i=colStart;i<=colEnd;i++){
        matrix[rowStart][i]=add;
        add++;
       }

       for(int i=rowStart+1;i<=rowEnd;i++){
         matrix[i][colEnd]=add;
         add++;
       }
       for(int i=colEnd-1;i>=colStart;i--){
        if(rowStart == rowEnd){
            break;
        }
         matrix[rowEnd][i]=add;
         add++;
       }
       for(int i=rowEnd-1;i>rowStart;i--){
        if( colStart == colEnd){
            break;
        }
         matrix[i][colStart]=add;
         add++;
       }

       rowStart++;
       colStart++;
       colEnd--;
       rowEnd--;
    }
return matrix;

    }
    public static void main(String[] args) {
        int[][] res =spriralII(3);

        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
        }
    }
    
}
