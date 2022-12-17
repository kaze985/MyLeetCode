import java.util.Arrays;

public class _1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int units = 0;
        Arrays.sort(boxTypes, (a, b)-> b[1] - a[1]);
        for (int i = 0; i < boxTypes.length; i++) {
            if (boxTypes[i][0] <= truckSize) {
                units += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            } else {
                units += boxTypes[i][1] * truckSize;
                break;
            }

        }
        return units;
    }
}
