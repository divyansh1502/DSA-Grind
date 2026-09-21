public class LC {
    public static void main(String[] args) {
        int[] prices = {886,729,539,474,5,653,588,198,313,111};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            if(maxProfit < prices[i] - min) {
                maxProfit = prices[i] - min;
            }       
        }
        return maxProfit;
    }
}