public class _1732 {
    public int largestAltitude(int[] gain) {
        int high = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : gain) {
            if (sum > high) {
                high = sum;
            }
            sum += j;
        }
        if (sum > high) {
            high = sum;
        }
        return high;
    }
}
