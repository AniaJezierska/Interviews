#include <iostream>
#include <string>
#include <cctype>

using namespace std;

class ValidPalindrome {
public:
    bool isPalindrome(string s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isalnum(s[left])) {
                left++;
            }
            while (left < right && !isalnum(s[right])) {
                right--;
            }
            if (tolower(s[left]) != tolower(s[right])) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
};

int main() {
    ValidPalindrome solution;

    string s = "A man, a plan, a canal: Panama";
    bool result = solution.isPalindrome(s);
    cout << "Is the string \"" << s << "\" a palindrome? " << (result ? "true" : "false") << endl;

    string s2 = "race a car";
    bool result2 = solution.isPalindrome(s2);
    cout << "Is the string \"" << s2 << "\" a palindrome? " << (result2 ? "true" : "false") << endl;

    return 0;
}
