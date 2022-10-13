public class HouseThiefDP {
    public static void main (String [] args) {
        int [] housePrices = {4,1,3,7,5,1,9,10};
        int maxProfit = findMaxHouseProfit (housePrices);
        System.out.println(maxProfit);
    }

    public static int findMaxHouseProfit(int [] housePrices) {
        int [] dp = new int [housePrices.length];
        if (housePrices.length == 0) {
            return 0;
        }
        dp[0] = housePrices[0];
        dp[1] = Math.max(dp[0], housePrices[1]);

        for (int i = 2; i < housePrices.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i - 2] + housePrices[i]);
        }
        return dp[dp.length - 1];
    }
}
