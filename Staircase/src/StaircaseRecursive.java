public class StaircaseRecursive {
    public static void main (String [] args) {
        int stairs = 4;
        int paths = findStaircasePaths (stairs);
        System.out.println(paths);
    }

    public static int findStaircasePaths (int stairs) {
        if (stairs == 0) {
            return 1;
        }
        if (stairs <= 2) {
            return stairs;
        }
        int oneStep = findStaircasePaths(stairs - 1);
        int twoStep = findStaircasePaths(stairs - 2);
        int threeStep = findStaircasePaths(stairs - 3);
        return oneStep + twoStep + threeStep;
    }
}
