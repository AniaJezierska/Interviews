class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        
        return true; 
    }

      public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        System.out.println("Is the string \"" + s + "\" a palindrome? " + result);
        
        String s2 = "race a car";
        boolean result2 = solution.isPalindrome(s2);
        System.out.println("Is the string \"" + s2 + "\" a palindrome? " + result2);
    }
}
