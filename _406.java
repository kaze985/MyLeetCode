import java.util.Arrays;
import java.util.LinkedList;

public class _406 {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return b[0] - a[0];
        });
        LinkedList<int[]> list = new LinkedList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            people[i] = list.get(i);
        }
        return people;
    }
}
