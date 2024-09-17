class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int sPointer = 0, tPointer = 0;

        while (sPointer < s.length() && tPointer < t.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        
        return sPointer == s.length();
    }

      public static void main(String[] args) {
        IsSubsequence checker = new IsSubsequence();

        String s = "abc";
        String t = "ahbgdc";
        
        boolean result = checker.isSubsequence(s, t);

        System.out.println("Is \"" + s + "\" a subsequence of \"" + t + "\"? " + result);
    }
}
