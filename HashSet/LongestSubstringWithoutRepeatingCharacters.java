import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLenght = 0;
        int left = 0;
        HashSet<Character> seenChars = new HashSet<>();

        for(int right = 0; right < n; right++){
            while (seenChars.contains(s.charAt(right))) {
                seenChars.remove(s.charAt(left));
                left++;
            }
            seenChars.add(s.charAt(right));
            maxLenght = Math.max(maxLenght, right - left + 1);
        }
        return maxLenght;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";

        System.out.println("Output for s1: " + solution.lengthOfLongestSubstring(s1)); // 3
        System.out.println("Output for s2: " + solution.lengthOfLongestSubstring(s2)); // 1
    }
}
