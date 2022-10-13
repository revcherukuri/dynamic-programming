public class StaircaseDP {
    public static void main (String [] args) {
        int stairs = 4;
        int paths = findStaircasePaths (stairs);
        System.out.println(paths);
    }

    public static int findStaircasePaths (int stairs) {
        if (stairs == 0) {
            return 1;
        }
        int [] dp = new int[stairs + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[dp.length - 1];
    }
}
