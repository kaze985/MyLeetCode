public class _1678 {
    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            switch (command.charAt(i)) {
                case 'G':
                    builder.append("G");
                    break;
                case '(':
                    if (command.charAt(i+1) == ')') {
                        builder.append("o");
                    }
                    if (command.charAt(i+1) == 'a') {
                        builder.append("al");
                    }
                    break;

            }

        }
        return builder.toString();
    }
}
