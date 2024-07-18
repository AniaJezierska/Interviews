public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0){
            int digit = x % 10;
            x = x /10;

            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        int x1 = 123;
        int x2 = -123;
        int x3 = 120;
        int x4 = 1534236469;

        System.out.println("Output for x1: " + solution.reverse(x1)); // 321
        System.out.println("Output for x2: " + solution.reverse(x2)); // -321
        System.out.println("Output for x3: " + solution.reverse(x3)); // 21
        System.out.println("Output for x4: " + solution.reverse(x4)); // 0
    }
}
