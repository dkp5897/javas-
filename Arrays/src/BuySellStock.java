public class BuySellStock {
    //method-1
    static int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit; 
    }

    //method-2 (Recomended)
    static int stockProfit(int prices[]){
        int n=prices.length;
        int profit=0;

        if(prices==null || n<=1){
            return 0;
        }

        for(int i=1;i<n;i++){
            if(prices[i-1]<prices[i]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);

        System.out.println(stockProfit(prices));
    }
}
