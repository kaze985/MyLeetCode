import java.util.Arrays;

public class _1005 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int result = 0;
        Integer[] array = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(array, (a, b) -> Math.abs(b) - Math.abs(a));
        for (int i = 0; i < array.length; i++) {
            if (k > 0 && array[i] < 0) {
                array[i] *= -1;
                k--;
            }
        }
        if (k % 2 == 1) {
            array[array.length - 1] *= -1;
        }
        for (Integer integer : array) {
            result += integer;
        }
        return result;
    }
}
