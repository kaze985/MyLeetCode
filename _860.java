public class _860 {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] == 10 || bills[0] == 20) {
            return false;
        }
        int[] money = new int[2];
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5 -> money[0]++;
                case 10 -> {
                    money[1]++;
                    if (money[0] > 0) {
                        money[0]--;
                    } else {
                        return false;
                    }
                }
                case 20 -> {
                    if (money[0] > 0 && money[1] > 0) {
                        money[1]--;
                        money[0]--;
                    } else if (money[0] > 2) {
                        money[0] = money[0] - 3;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
