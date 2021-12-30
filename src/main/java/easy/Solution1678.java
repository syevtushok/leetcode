package easy;

class Solution1678 {
    public String interpret(String command) {
        char[] c = command.toCharArray();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            char temp = c[i];
            if (i == c.length - 1 && temp == 'G') {
                s.append("G");
                continue;
            }
            char tempNext = c[i + 1];
            if (temp == '(') {
                if (tempNext == ')') {
                    s.append("o");
                    i++;
                } else {
                    s.append("al");
                    i += 3;
                }
            } else {
                s.append("G");
            }
        }
        return s.toString();
    }
}