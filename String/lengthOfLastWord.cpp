#include <string>

using namespace std;

class Solution {
public:
    int lengthOfLastWord(string s) {
        int p = s.length(), length = 0;

        while (p > 0) {
            p--;
            if (s[p] != ' ') {
                length++;
            } else if (length > 0) {
                return length;
            }
        }
        return length;
    }
};
