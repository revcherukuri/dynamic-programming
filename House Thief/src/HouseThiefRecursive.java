public class HouseThiefRecursive {
    public static void main (String [] args) {
        int [] housePrices = {2, 10, 14, 8, 1};
        int maxProfit = findMaxHouseProfit (housePrices);
        System.out.println(maxProfit);
    }

    public static int findMaxHouseProfit (int [] housePrices) {
        return findMaxHouseProfitRecursive (housePrices, 0);
    }

    public static int findMaxHouseProfitRecursive (int [] housePrices, int index) {
        if  (housePrices.length <= index) {
            return 0;
        }
        int profit1 = housePrices[index] + findMaxHouseProfitRecursive(housePrices, index + 2);
        int profit2 = findMaxHouseProfitRecursive(housePrices, index + 1);

        return Math.max(profit1, profit2);
    }
}
