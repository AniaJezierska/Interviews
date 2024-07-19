public class Atoi {
    public int myAtoi(String s) {
        int idx = 0;
        int n = s.length();
        int result = 0;
        int sign = 1;

        // Ignore leading whitespace
        while (idx < n && s.charAt(idx) == ' ') {
            idx++;
        }

        if (idx < n && (s.charAt(idx) == '+' || s.charAt(idx) == '-')) {
            sign = (s.charAt(idx) == '-') ? -1 : 1;
            idx++;
        }

        while (idx < n && Character.isDigit(s.charAt(idx))) {
            int digit = s.charAt(idx) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            idx++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        Atoi solution = new Atoi();

        // Test cases
        System.out.println(solution.myAtoi("42")); // 42
        System.out.println(solution.myAtoi("   -042")); // -42
        System.out.println(solution.myAtoi("1337c0d3")); // 1337
        System.out.println(solution.myAtoi("0-1")); // 0
        System.out.println(solution.myAtoi("words and 987")); // 0
    }
}
