package easy;

/**
 * int i = 0;
 * <p>
 * for (String operation : operations) {
 * switch (operation) {
 * case "--X":
 * --i;
 * break;
 * case "++X":
 * ++i;
 * break;
 * case "X--":
 * i--;
 * break;
 * case "X++":
 * i++;
 * break;
 * }
 * }
 * <p>
 * return i;
 */
class Solution2011 {
    public static void main(String[] args) {
        System.out.println(new Solution2011().finalValueAfterOperations(new String[]{ "--X", "X++", "X++" }));
    }

    public int finalValueAfterOperations(String[] operations) {
        int i = 0;

        for (String operation : operations) {
            char c = operation.charAt(1);
            i = c == '-' ? i - 1 : i + 1;
        }

        return i;
    }
}