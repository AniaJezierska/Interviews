#include <iostream>
#include <unordered_set>
#include <algorithm>
using namespace std;

class LongestSubstringWithoutRepeatingCharacters {
public:
    int lengthOfLongestSubstring(const string& s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        unordered_set<char> seenChars;

        for (int right = 0; right < n; ++right) {
            while (seenChars.find(s[right]) != seenChars.end()) {
                seenChars.erase(s[left]);
                ++left;
            }
            seenChars.insert(s[right]);
            maxLength = max(maxLength, right - left + 1);
        }
        return maxLength;
    }
};

int main() {
    longestSubstringWithoutRepeatingCharacters solution;

    string s1 = "abcabcbb";
    string s2 = "bbbbb";

    cout << "Output for s1: " << solution.lengthOfLongestSubstring(s1) << endl; // 3
    cout << "Output for s2: " << solution.lengthOfLongestSubstring(s2) << endl; // 1

    return 0;
}
