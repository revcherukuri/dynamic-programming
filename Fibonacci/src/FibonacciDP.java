public class FibonacciDP {
    public static void main (String [] args) {
        int val = 6;
        int fibVal = findFib (val);
        System.out.println("Value " + (val + 1) + " in Fibonacci sequence: " + fibVal);
    }

    public static int findFib (int val) {
        if (val < 2) {
            return val;
        }
        int [] dp = new int [val + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[dp.length - 1];
    }
}
