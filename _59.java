public class _59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int num = 1;
        for (int k = 0; k <= n / 2; k++) {

            for (int i = k; i < n - 1 - k; i++) {
                matrix[k][i] = num;
                num++;
            }
            for (int i = k; i < n - 1 - k; i++) {
                matrix[i][n - 1 - k] = num;
                num++;
            }
            for (int i = n - 1 - k; i > k; i--) {
                matrix[n - 1 - k][i] = num;
                num++;
            }
            for (int i = n - 1 - k; i > k; i--) {
                matrix[i][k] = num;
                num++;
            }

        }
        if (n % 2 == 1) {
            matrix[n / 2][n / 2] = n * n;
        }
        return matrix;
    }
}
