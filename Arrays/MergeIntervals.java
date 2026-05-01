package Arrays;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {

       
        
        java.util.Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();

        int[] current = intervals[0]; 

        for (int i = 1; i < intervals.length; i++) {


            if (current[1] >= intervals[i][0]) {
            
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
    
                list.add(current);
                current = intervals[i]; // move forward
            }
        }

        list.add(current);

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{8,10},{15,18}};

        int[][] res = merge(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.println(java.util.Arrays.toString(res[i]));
        }
    }
}