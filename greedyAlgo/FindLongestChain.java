package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class FindLongestChain {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingInt(o->o[1]));
        int count =1;
        int end=pairs[0][1];

        for(int i=1;i<pairs.length;i++){

            if(pairs[i][0] >= end){
                count++;
                end=pairs[i][1];
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2},{7,8},{4,5}};
        System.out.println(findLongestChain(arr));
    }
}
