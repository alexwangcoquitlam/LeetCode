package Easy;

public class BuyAndSellStock {
    public static void main(String[] args){
        // #121
        int[] input = {7,1,5,3,6,4};
        System.out.println(maxProfit(input));
    }    

    public static int maxProfit(int[] prices){
        // O(n)
        int buyDay = 0;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            if((prices[i] - prices[buyDay]) > maxProfit){
                maxProfit = prices[i] - prices[buyDay];
            }
            else{
                if(prices[i] < prices[buyDay]){
                    buyDay = i;
                }
            }
        }
        return maxProfit;
    }

    public static int maxProfitTrivial(int[] prices){
        // O(n^2)
        int biggestProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                biggestProfit = Math.max(prices[j] - prices[i], biggestProfit);
            }
        }
        return biggestProfit;
    }
}

