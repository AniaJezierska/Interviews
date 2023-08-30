#include <iostream>
#include <unordered_map>
#include <stack>

using namespace std;

class ValidParentheses {
private:
    static const unordered_map<char, char> map;

public:
    bool isValid(string s) {
        stack<char> stk;

        for (char c : s) {
            if (map.find(c) != map.end()) {
                // Check if the key exists in the map
                stk.push(c);
            } else {
                if (stk.empty()) {
                    return false;
                }
                char open = stk.top();
                stk.pop();
                if (map.at(open) != c) {
                    return false;
                }
            }
        }
        return stk.empty();
    }
};

const unordered_map<char, char> ValidParentheses::map = {
        {'(', ')'},
        {'{', '}'},
        {'[', ']'}
};

int main() {
    string s1 = "()";
    string s2 = "()[]{}";
    string s3 = "(]";
    ValidParentheses solution;

    cout << s1 << " is valid: " << (solution.isValid(s1) ? "true" : "false") << endl;
    cout << s2 << " is valid: " << (solution.isValid(s2) ? "true" : "false") << endl;
    cout << s3 << " is valid: " << (solution.isValid(s3) ? "true" : "false") << endl;

    return 0;
}
