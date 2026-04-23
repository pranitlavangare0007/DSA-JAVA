package Arrays;

import java.util.HashSet;

public class FindMissingAndRepatedvalue {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int res[] = new int[2];
        int range = grid.length * grid.length;
        int totalSum = range * (range + 1) / 2;
     
        int gridSum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                gridSum += grid[i][j];
                if(set.contains(grid[i][j])){
                    res[0]=grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }
            }
        }
        res[1]=totalSum - (gridSum-res[0]);

        return res;
    }

    public static void main(String[] args) {
        int arr[][] = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
       int res[] =findMissingAndRepeatedValues(arr);
       for(int n: res){
        System.out.print(n+" ");
       }
    }

}
