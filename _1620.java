class Solution_1620 {
    public int[] bestCoordinate(int[][] towers, int radius) {
        int maxX, minX ,maxY ,minY;
        int[] max = new int[2];
        int maxSignalStrength = 0;
        maxX = minX = towers[0][0];
        maxY = minY = towers[0][1];
        for (int i = 1; i < towers.length; i++) {
            if (towers[i][0] > maxX) {
                maxX = towers[i][0];
            }
            if (towers[i][0] < minX) {
                minX = towers[i][0];
            }
            if (towers[i][1] > maxY) {
                maxY = towers[i][1];
            }
            if (towers[i][1] < minY) {
                minY = towers[i][1];
            }
        }
        for (int i = minX; i <= maxX; i++) {
            for (int j = minY; j <= maxY; j++) {

                int strengthSum = 0;
                for (int[] tower : towers) {
                    double distance = distance(tower[0], tower[1], i, j);
                    strengthSum += signalStrength(tower[2], radius, distance);
                }
                if (strengthSum > maxSignalStrength) {
                    maxSignalStrength = strengthSum;
                    max[0] = i;
                    max[1] = j;
                }

            }
        }
        return max;
    }
    public double distance(int towerX, int towerY, int pointX, int pointY) {
        return Math.sqrt(Math.pow(towerX - pointX, 2) + Math.pow(towerY - pointY, 2));
    }
    public int signalStrength(int q, int radius, double distance) {
        if (distance > radius) {
            return 0;
        }
        return (int) Math.floor(q / (1 + distance));
    }
}
// 2128824169 李鹏鹏
