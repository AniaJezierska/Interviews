public class LongestPalindromicSubstring {
    public String longestPalindrome(String s){
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++){
            int len1 = expandAroundCenter(s, i, i); // Rozwijanie wokół jednego znaku
            int len2 = expandAroundCenter(s, i,i+1); // Rozwijanie wokół dwóch znaków
            int len = Math.max(len1, len2);

            if (len > end - start) { // Sprawdzenie, czy długość obecnie znalezionego palindromu jest większa niż długość najdłuższego dotychczas znalezionego palindromu
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int left, int right){
        int L = left, R = right;

        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }


    public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println("Output for s1: " + solution.longestPalindrome(s1)); // "bab" lub "aba"
        System.out.println("Output for s2: " + solution.longestPalindrome(s2)); // "bb"
    }

}
