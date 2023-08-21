public class Solution {
    public int myAtoi(String s) {
        final int INT_MIN = Integer.MIN_VALUE;
        final int INT_MAX = Integer.MAX_VALUE;

        s = s.trim();

        StringBuilder sb = new StringBuilder();
        for (char character : s.toCharArray()) {
            if ((sb.length() == 0 && (character == '-' || character == '+')) || Character.isDigit(character)) {
                sb.append(character);
            } else {
                break;
            }
        }

        if (sb.length() == 0 || sb.toString().equals("-") || sb.toString().equals("+")) {
            return 0;
        }

        try {
            long num = Long.parseLong(sb.toString());
            if (num < INT_MIN) return INT_MIN;
            if (num > INT_MAX) return INT_MAX;
            return (int) num;
        } catch (NumberFormatException e) {
            return sb.charAt(0) == '-' ? INT_MIN : INT_MAX;
        }
    }
}
