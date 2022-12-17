import java.util.ArrayList;
import java.util.List;

public class _816 {


    public List<String> ambiguousCoordinates(String s) {
        List<String> listX = new ArrayList<>();
        List<String> listY = new ArrayList<>();
        List<String> result = new ArrayList<>();
        String number = s.substring(1, s.length() - 1);
        for (int i = 1; i < number.length(); i++) {
            String x = number.substring(0, i);
            listX.add(x);
            for (int j = 1; j < x.length(); j++) {
                StringBuilder builder = new StringBuilder(x);
                builder.insert(j, ".");
                listX.add(builder.toString());
            }
            
            String y = number.substring(i);
            listY.add(y);
            for (int j = 1; j < y.length(); j++) {
                StringBuilder builder = new StringBuilder(y);
                builder.insert(j, ".");
                listY.add(builder.toString());
            }
            
            for (String s1 : listX) {
                for (String s2 : listY) {
                    Point point = new Point(s1, s2);
                    if (point.check()) {
                        result.add(point.toString());
                    }
                }
            }
            
            listX.clear();
            listY.clear();
        }
        return result;
    }
}
class Point{
    String x;
    String y;

    public Point(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public boolean check() {
        String[] splitX = x.split("\\.");
        String[] splitY = y.split("\\.");
        if (splitX[0].length() > 1 && splitX[0].charAt(0) == '0') {
            return false;
        }
        if (splitX.length > 1) {
            if (splitX[1].charAt(splitX[1].length() - 1) == '0') {
                return false;
            }
        }

        if (splitY[0].length() > 1 && splitY[0].charAt(0) == '0') {
            return false;
        }
        if (splitY.length > 1) {
            if (splitY[1].charAt(splitY[1].length() - 1) == '0') {
                return false;
            }
        }

        return true;
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}