#include <iostream>
#include <algorithm>
using namespace std;

class LongestPalindromicSubstring{
public:
    string longestPalindrome(string s){
        if(s.empty()) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = max(len1, len2);

            if (len > end - start){
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substr(start, end - start +1);
    }

private:
    int expandAroundCenter(const string& s, int left, int right) {
        int L = left, R = right;

        while (L >= 0 && R < s.length() && s[L] == s[R]) {
            L--;
            R++;
        }
        return R - L - 1;
    }
};

int main() {
    LongestPalindromicSubstring solution;

    // Przykłady testów
    string s1 = "babad";
    string s2 = "cbbd";

    cout << "Output for s1: " << solution.longestPalindrome(s1) << endl; // "bab" lub "aba"
    cout << "Output for s2: " << solution.longestPalindrome(s2) << endl; // "bb"

    return 0;
}
