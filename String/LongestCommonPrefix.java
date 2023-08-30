public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {

        if(str.length == 0)
            return "";
        // taking the first item as a prefix
        String prefix = str[0];

        for(int i = 1; i < str.length; i++){
            // remove the last prefix letter util both words have the same beginning
            while(str[i].indexOf(prefix) != 0){
                //remove the last letter
                prefix = prefix.substring(0, prefix.length() - 1);
                // if we remove every letter it means there is no common prefix
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String[] str = {"dog","racecar","car"};
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println("Longest common prefix: " + lcp.longestCommonPrefix(strs));
        System.out.println("Longest common prefix: " + lcp.longestCommonPrefix(str));
    }
}
