public class AddBinary {
    public String addBinary(String a, String b) {
        // to store the lengths of strings
        int n = a.length();
        int m = b.length();
        if (n < m) return addBinary(b, a);

        // to build the result binary string
        StringBuilder sb = new StringBuilder();

        // to store the carry value during binary addition
        int carry = 0;

        int j = m - 1;

        for (int i = n - 1; i > -1; --i) {
            // if the current character in string a is '1', increments the carry
            if (a.charAt(i) == '1')
                ++carry;
            if (j > -1 && b.charAt(j--) == '1')
                ++carry;
            // appends '1' to the StringBuilder if carry is odd
            if (carry % 2 == 1)
                sb.append('1');
            else sb.append('0');

            carry /= 2;
        }
        if (carry == 1)
            sb.append('1');
        // reverses the content of the StringBuilder to obtain the correct order for the binary sum
        sb.reverse();

        return sb.toString();
    }
}
