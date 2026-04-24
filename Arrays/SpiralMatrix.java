package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralMatrix(int matrix[][] ){

        List<Integer> list = new ArrayList<>();

        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd){

        

       for(int i=colStart;i<=colEnd;i++){
        list.add(matrix[rowStart][i]);
       }

       for(int i=rowStart+1;i<=rowEnd;i++){
         list.add(matrix[i][colEnd]);
       }
       for(int i=colEnd-1;i>=colStart;i--){
        if(rowStart == rowEnd){
            break;
        }
         list.add(matrix[rowEnd][i]);
       }
       for(int i=rowEnd-1;i>rowStart;i--){
        if( colStart == colEnd){
            break;
        }
         list.add(matrix[i][colStart]);
       }

       rowStart++;
       colStart++;
       colEnd--;
       rowEnd--;
    }
return list;

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralMatrix(arr));
    }
    
}
