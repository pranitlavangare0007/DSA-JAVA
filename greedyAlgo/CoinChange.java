package greedyAlgo;

import java.util.Arrays;

public class CoinChange {
     public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count=0;

        for(int i=coins.length-1;i>=0;i--){
    
            while (coins[i] <= amount) {
                amount -= coins[i];
                count++;
                
            }
        }
       System.out.println(amount);
        return amount > 0?-1:count;
    }
    public static void main(String[] args) {
        int arr[]={186,419,83,408};
        int amount=6249;
        System.out.println(coinChange(arr, amount));
    }
}
