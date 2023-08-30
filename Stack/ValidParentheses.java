import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private static final Map<Character, Character> map = Map.of('(',')','{','}','[',']');
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            //if map does contain 'c' then it's an open parentheses
            if (map.containsKey(c)){
                //when it's open I want to add it to stack
                stack.push(c);
                //if it's closed parentheses
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char open = stack.pop();
                if (map.get(open) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        ValidParentheses solution = new ValidParentheses();

        System.out.println(s1 + " is valid: " + solution.isValid(s1));
        System.out.println(s2 + " is valid: " + solution.isValid(s2));
        System.out.println(s3 + " is valid: " + solution.isValid(s3));
    }
}
