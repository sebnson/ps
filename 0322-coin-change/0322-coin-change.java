//dynamic programming
import java.util.Arrays;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        
        int maxCost = Integer.MAX_VALUE;
        int[] dpArray = new int[amount + 1];
        Arrays.fill(dpArray, -1);
        dpArray[0] = 0;

        //동전 교환
        for (int idx = 1; idx <= amount; idx++) {
            if (dpArray[idx] != -1) {
                continue;
            }

            int currentMin = maxCost;
            for (int coin : coins) {
                int lastIdx = idx - coin;
                if (lastIdx < 0) {
                    continue;
                }
                int lastCost = dpArray[lastIdx];
                if (lastCost == -1) {
                    continue;
                }
                int cost = lastCost + 1;
                currentMin = Math.min(cost, currentMin);
            }

            dpArray[idx] = (currentMin == maxCost) ? -1 : currentMin;
        }

        return dpArray[amount];
    }
}
