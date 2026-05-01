package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
       int index=0;
       
       int i=1;
       int j = 0;

       while (i < intervals.length) {
        if(intervals[i-1][j+1] > intervals[i][j] ){
            System.out.println(intervals[i-1][j] + " "+intervals[i][j+1]);
            list.add(new ArrayList<>());
            list.get(index).add(intervals[i-1][j]);
            list.get(index).add(intervals[i][j+1]);
           i++;
        }else{
            System.out.println(intervals[i][j]+" "+intervals[i][j+1]);
             list.add(new ArrayList<>());
            list.get(index).add(intervals[i][j]);
            list.get(index).add(intervals[i][j+1]);
             i++;
        }
        index++;
      
        
        
        
       }
System.out.println(list.toString());
        return intervals;

    }
    public static void main(String[] args) {
        int arr[][]={{1,3},{2,6},{8,10},{15,18}};
        merge(arr);
    }
}
