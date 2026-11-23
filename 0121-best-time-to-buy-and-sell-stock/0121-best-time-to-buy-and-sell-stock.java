class Solution {
    public int maxProfit(int[] prices) {
        
        // Start with the most expensive number possible so the first stock price 
        // instantly becomes the new cheapest.
        int cheapest = Integer.MAX_VALUE; 
        
        // If we never make a profit, the answer is 0 (no negative profits allowed).
        int maxProfit = 0; 

        for (int i = 0; i < prices.length; i++) {
            
            // Look at today's price.
            // Is it cheaper than the cheapest day we've seen so far?
            if (prices[i] < cheapest) {
                cheapest = prices[i]; // Yes? Update our record low.
            }

            // Okay, let's see if selling today is a good idea.
            // Profit = Today's Price - The cheapest day we've seen up to THIS point.
            int profit = prices[i] - cheapest;

            // Is this profit better than our best profit so far?
            if (profit > maxProfit) {
                maxProfit = profit; // Yes? Save it as the new best.
            }
        }

        // By the end of the loop, we've checked every single day.
        // maxProfit holds the biggest gap between a low price and a future high price.
        return maxProfit;
    }
}