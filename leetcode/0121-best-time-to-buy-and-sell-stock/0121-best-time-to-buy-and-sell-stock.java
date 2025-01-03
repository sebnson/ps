class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            minPrice = Math.min(minPrice, price); //finding minPrice
            maxProfit = Math.max(maxProfit, price-minPrice); //finding maxProfit
        }
        return maxProfit;
    }
}