#include <iostream>
#include <string>
#include <vector>
using namespace std;

class ZigzagConversion {
public:
    string convert(const string &s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        vector<string> rows(numRows);
        int currentRow = 0;
        bool goingDown = false;

        for (char c : s) {
            rows[currentRow] += c;

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        string result;
        for (const string &row : rows) {
            result += row;
        }

        return result;
    }
};

int main() {
    ZigzagConversion zigzagConversion;
    string s1 = "PAYPALISHIRING";
    int numRows1 = 3;
    string s2 = "PAYPALISHIRING";
    int numRows2 = 4;

    string result1 = zigzagConversion.convert(s1, numRows1);
    string result2 = zigzagConversion.convert(s2, numRows2);

    cout << "Output for s1: " << result1 << endl; // "PAHNAPLSIIGYIR"
    cout << "Output for s2: " << result2 << endl; // "PINALSIGYAHRPI"

    return 0;
}
