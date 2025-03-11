import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapST.containsKey(charS) && mapST.get(charS) != charT) {
                return false;
            }

            if (mapTS.containsKey(charT) && mapTS.get(charT) != charS) {
                return false;
            }

            mapST.put(charS, charT);
            mapTS.put(charT, charS);
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));    
        System.out.println(isIsomorphic("foo", "bar"));    
        System.out.println(isIsomorphic("paper", "title"));
    }
}
