import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> mapPatternToWord = new HashMap<>();
        Map<String, Character> mapWordToPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char charPattern = pattern.charAt(i);
            String word = words[i];

            if (mapPatternToWord.containsKey(charPattern) && !mapPatternToWord.get(charPattern).equals(word)) {
                return false;

            }
            if (mapWordToPattern.containsKey(word) && mapWordToPattern.get(word) != charPattern) {
                return false;
            }
            mapPatternToWord.put(charPattern, word);
            mapWordToPattern.put(word, charPattern);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
