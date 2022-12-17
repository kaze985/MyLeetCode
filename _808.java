public class _808 {
    double emptyA = 0;
    double emptyAB = 0;

    public void diveSoupA(int soupA, int soupB, int round) {
        if (soupA <= 0 && soupB <= 0) {
            return;
        }

        if (soupA > 0 && soupB > 0 && soupA - 4 <= 0 && soupB - 0 > 0) {
            emptyA += Math.pow(0.25, round);
        } else if (!(soupA <= 0 && soupB > 0)) {
            diveSoupA(soupA - 4, soupB - 0, round + 1);
        }

        if (soupA > 0 && soupB > 0 && soupA - 3 <= 0 && soupB - 1 > 0) {
            emptyA += Math.pow(0.25, round);
        } else {
            diveSoupA(soupA - 3, soupB - 1, round + 1);
        }

        if (soupA > 0 && soupB > 0 && soupA - 2 <= 0 && soupB - 2 > 0) {
            emptyA += Math.pow(0.25, round);
        } else {
            diveSoupA(soupA - 2, soupB - 2, round + 1);
        }

        if (soupA > 0 && soupB > 0 && soupA - 1 <= 0 && soupB - 3 > 0) {
            emptyA += Math.pow(0.25, round);
        } else {
            diveSoupA(soupA - 1, soupB - 3, round + 1);
        }
    }

    public void diveSoupAB(int soupA, int soupB, int round) {
        if (soupA <= 0 && soupB <= 0) {
            return;
        }

        if (soupA > 0 && soupB > 0 && soupA - 3 <= 0 && soupB - 1 <= 0) {
            emptyAB += Math.pow(0.25, round);
        } else {
            diveSoupAB(soupA - 3, soupB - 1, round + 1);
        }

        if (soupA > 0 && soupB > 0 && soupA - 2 <= 0 && soupB - 2 <= 0) {
            emptyAB += Math.pow(0.25, round);
        } else {
            diveSoupAB(soupA - 2, soupB - 2, round + 1);
        }

        if (soupA > 0 && soupB > 0 && soupA - 1 <= 0 && soupB - 3 <= 0) {
            emptyAB += Math.pow(0.25, round);
        } else {
            diveSoupAB(soupA - 1, soupB - 3, round + 1);
        }
    }

    public double soupServings(int n) {
        if (n == 0) {
            return 0.5;
        }
        diveSoupA(n / 25, n / 25, 1);
        diveSoupAB(n / 25, n / 25, 1);
        return emptyA + emptyAB / 2;
    }

    public static void main(String[] args) {
        System.out.println(new _808().soupServings(500));
    }
}
