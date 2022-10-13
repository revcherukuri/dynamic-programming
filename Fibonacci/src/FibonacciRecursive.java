public class FibonacciRecursive {
    public static void main (String [] args) {
        int val = 6;
        int fibVal = findFib (val);
        System.out.println("Value " + (val + 1) + " in Fibonacci sequence: " + fibVal);
    }

    public static int findFib (int val) {
        if (val < 2) {
            return val;
        }
        return findFib (val - 1) + findFib (val - 2);
    }
}
