public class ZigzagConversion {
    public String convert (String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows -1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion solution = new ZigzagConversion();

        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Output for s1: " + solution.convert(s1, numRows1)); // "PAHNAPLSIIGYIR"

        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        System.out.println("Output for s2: " + solution.convert(s2, numRows2)); // "PINALSIGYAHRPI"

        String s3 = "A";
        int numRows3 = 1;
        System.out.println("Output for s3: " + solution.convert(s3, numRows3)); // "A"
    }
}
