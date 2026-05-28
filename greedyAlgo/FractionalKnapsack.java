package greedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
     public static double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here

        double arr[][]= new double[val.length][2];

        for(int i=0;i<val.length;i++){
            arr[i][0]=i;
            arr[i][1]=val[i] / (double)wt[i];
        }
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[1]));
        int cap=capacity;
        double value=0;

        for(int i=arr.length-1;i>=0;i--){
            int idx=(int)arr[i][0];
            if(cap >= wt[idx]){
                value += val[idx];
                cap -= wt[idx];
            }else{
                value += arr[i][1] * cap;
                cap=0;
                break;
            }
        }
        return value;
    }
    
    public static void main(String[] args) {
        int  val[] = {60, 100, 120}, wt[] = {10, 20, 30}, capacity = 50;
        System.out.println(fractionalKnapsack(val, wt, capacity));
    }
}
