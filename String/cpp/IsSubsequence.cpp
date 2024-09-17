#include <iostream>
#include <algorithm>

using namespace std;

class IsSubsequence {
public:
    bool isSubsequence(string s, string t) {
        int sPointer = 0, tPointer = 0;

        while (sPointer < s.size() && tPointer < t.size()) {
            if (s[sPointer] == t[tPointer]) {
                sPointer++;
            }
            tPointer++;
        }

        return sPointer == s.size();
    }
};

int main() {
    IsSubsequence checker;

    string s = "abc";
    string t = "ahbgdc";

    bool result = checker.isSubsequence(s, t);

    cout << "Is \"" << s << "\" a subsequence of \"" << t << "\"? " << (result ? "true" : "false") << endl;

    return 0;
}
