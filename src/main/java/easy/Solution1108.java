package easy;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The given address is a valid IPv4 address.
 */
class Solution1108 {
    public static void main(String[] args) {
        System.out.println(new Solution1108().defangIPaddr("1.1.1.1"));
        System.out.println(new Solution1108().defangIPaddr("1.1.1.1"));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddrSecondApproach(String address) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                stringBuilder.append("[").append(".").append("]");
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

}