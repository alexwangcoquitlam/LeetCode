package Easy;

public class BuyAndSellStock {
    public static void main(String[] args){
        // #121 Best time to buy and sell stock
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfit(input));
    }    

    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(prices[i] - minPrice, maxProfit);
        }
        return maxProfit;
    }
}

