import java.util.Arrays;
// ！！！不会写！！！！！
public class _764 {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] ints = new int[n][n];
        int k, i;
        int k1 = -1;
        int i1 = -1;
        for (int[] anInt : ints) {
            Arrays.fill(anInt, 1);
        }
        for (int[] mine : mines) {
            ints[mine[0]][mine[1]] = 0;
        }
        for (k = 0; k <= n / 2; k++) {
            for (i = k; i < ints.length - k; i++) {
                for (i1 = k; i1 < ints[i].length - k; i1++) {
                    if (ints[i][i1] == 0) {
                        continue;
                    }
                    for (k1 = k; k1 > 0; k1--) {
                        if ((ints[i][i1 - k1] == 0) || (ints[i][i1 + k1] == 0) || (ints[i - k1][i1] == 0) || (ints[i + k1][i1] == 0)) {
                            break;
                        }
                    }
                    if (k1 == 0) {
                        break;
                    }
                }
                if (i == ints.length - k - 1 && i1 == ints[0].length - k) {
                    return k;
                }
                if (k1 == 0) {
                    break;
                }
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int i = new _764().orderOfLargestPlusSign(3, new int[][]{{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}});
        System.out.println(i);
    }
}
