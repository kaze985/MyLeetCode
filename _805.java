import java.util.*;

public class _805 {
    public boolean splitArraySameAverage(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return false;
        }
        int s = Arrays.stream(nums).sum();
        int subSum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * n - s;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int k = 0; k < n / 2; k++) {
            subSum = 0;
            for (int i = k; i < n / 2; i++) {
                subSum += nums[i];
                if (subSum == 0) {
                    return true;
                } else {
                    map.put(subSum, i - k + 1);
                }
            }
        }
        for (int k = n / 2; k < n; k++) {
            subSum = 0;
            for (int i = k; i < n; i++) {
                subSum += nums[i];
                if (subSum == 0 || (map.containsKey(subSum * -1) && (map.get(subSum * -1) + (i - k + 1)) != n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = new _805().splitArraySameAverage(new int[]{1567, 2106, 4090, 293, 9642, 7740, 9159, 136, 3724, 1373, 9397, 3829, 1622, 1888, 7250, 8252, 12});
        System.out.println(b);
    }
}
