package Arrays;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        
        for(int selling=0;selling<prices.length;selling++){
            if(buyPrice < prices[selling] ){
                int profit= prices[selling]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice= prices[selling];
            }
        }


        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
    
}
