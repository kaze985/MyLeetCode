import java.util.HashSet;

public class _202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        while (!set.contains(sum)) {
            set.add(sum);
            sum = 0;
            while (n != 0) {
                sum += (int)Math.pow(n % 10, 2);
                n /= 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }
}
