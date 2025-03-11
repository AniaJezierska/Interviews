class RansonNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] letterCounts = new int[26];

        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letterCounts[c - 'a'] == 0) {
                return false;
            }
            letterCounts[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }
}
