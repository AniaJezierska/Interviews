#include <iostream>
#include <string>
#include <climits> // for INT_MAX and INT_MIN
using namespace std;

class Atoi {
public:
    int myAtoi(const string& s) {
        int idx = 0;
        int n = s.length();
        int result = 0;
        int sign = 1;

        // Ignore leading whitespace
        while (idx < n && s[idx] == ' ') {
            idx++;
        }

        if (idx < n && (s[idx] == '+' || s[idx] == '-')) {
            sign = (s[idx] == '-') ? -1 : 1;
            idx++;
        }

        while (idx < n && isdigit(s[idx])) {
            int digit = s[idx] - '0';

            if (result > (INT_MAX - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            idx++;
        }

        return result * sign;
    }
};

int main() {
    Atoi solution;

    // Test cases
    cout << solution.myAtoi("42") << endl;         // 42
    cout << solution.myAtoi("   -042") << endl;    // -42
    cout << solution.myAtoi("1337c0d3") << endl;   // 1337
    cout << solution.myAtoi("0-1") << endl;        // 0
    cout << solution.myAtoi("words and 987") << endl; // 0

    return 0;
}
