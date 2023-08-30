import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    static Map<String, Integer> val = new HashMap<>();

    static {
        val.put("I",1);
        val.put("V",5);
        val.put("X",10);
        val.put("L",50);
        val.put("C",100);
        val.put("D",500);
        val.put("M",1000);
        val.put("IV",4);
        val.put("IX",9);
        val.put("XL",40);
        val.put("XC",90);
        val.put("CD",400);
        val.put("CM",900);
    }

    public int romanToInt(String s) {
        int currSum = 0;
        int i = 0;

        while(i < s.length()) {
            if(i < s.length() - 1) {
                String doubleSymbol = s.substring(i, i + 2);

                if(val.containsKey(doubleSymbol)) {
                    currSum += val.get(doubleSymbol);
                    i += 2;
                    continue;
                }
            }

            String singleSymbol = s.substring(i, i + 1);
            currSum += val.get(singleSymbol);
            i += 1;
        }
        return currSum;
    }
}

/* Input: s = "III"
Output: 3

Input: s = "LVIII"
Output: 58

Input: s = "MCMXCIV"
Output: 1994
 */
