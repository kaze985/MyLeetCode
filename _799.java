public class _799 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] f = new double[100][100];
        f[0][0] = poured;
        double flow;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if (f[i][j] > 1) {
                    flow = (f[i][j] - 1) / 2;
                    f[i][j] = 1;
                    if (i < 99 && j < 99) {
                        f[i + 1][j] += flow;
                        f[i + 1][j + 1] += flow;
                    }
                }
            }
        }
        return f[query_row][query_glass];
    }

    public static void main(String[] args) {
        System.out.println(new _799().champagneTower(7, 5, 0));
    }
}
