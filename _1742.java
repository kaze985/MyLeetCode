import java.util.Arrays;

public class _1742 {
    public int countBalls(int lowLimit, int highLimit) {
        int[] box = new int[100];
        int sum = 0;
        for (int i = lowLimit; i <= highLimit; i++) {
            int num = i;
            while (num != 0) {
                sum += (num % 10);
                num /= 10;
            }
            box[sum]++;
            sum = 0;
        }
        return Arrays.stream(box).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(new _1742().countBalls(1, 10));
    }
}
