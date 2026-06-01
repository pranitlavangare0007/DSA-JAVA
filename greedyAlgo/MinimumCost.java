package greedyAlgo;

import java.util.Arrays;

public class MinimumCost {
    public static int minimumCost(int[] cost) {
        int count = 1;
        int minCost = 0;
        Arrays.sort(cost);
        
        for (int i = cost.length - 1; i >= 0; i--) {

            if (count == 3) {
               count=1;
               continue;
               
            }
            count++;
           
            minCost += cost[i];
        }
        return minCost;

    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 9, 4, 1, 9, 10, 2, 10, 8 };
        System.out.println(minimumCost(arr));
    }
}
