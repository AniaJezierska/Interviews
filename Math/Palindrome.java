import java.util.Arrays;

public class Palindrome {

    public static boolean isPalindrome(int number) {
        // we can return false for all negative numbers..
        if (number < 0 || (number != 0 && number%10 == 0))
            return false;
        int reversed = 0;
        while (number > reversed){
            // we get the last digit by %10 for ex. 1 for 1221
            reversed = reversed*10 + number%10;
            // to get the second to the last digit, we need to remove the last digit by /10..
            // and %10 for ex. 2 for 122 (in the next rotation of the loop)
            number = number/10;
        }
        return (number == reversed || number == reversed/10);
    }

    public static void main(String[] args) {

        int x = 1221;
        System.out.println("Is palindrome? " + (isPalindrome(x)));

    }
}
