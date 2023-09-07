// first we locate the last word, then we count the length of the last word

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // we'll locate the last word starting from the end of the string
        int pointer = s.length(), length = 0;

        while (pointer > 0) {
            pointer--;
            if (s.charAt(pointer) != ' ') {
                length++;
            }
            // here is the end of last word
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWordObj = new LengthOfLastWord();

        String s1 = "Hello World";
        System.out.println(lengthOfLastWordObj.lengthOfLastWord(s1)); // Output: 5

        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWordObj.lengthOfLastWord(s2)); // Output: 4

        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWordObj.lengthOfLastWord(s3)); // Output: 6
    }
}
