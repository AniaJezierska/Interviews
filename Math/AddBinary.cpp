class AddBinary {
public:
    string addBinary(string a, string b) {
        int n = a.length();
        int m = b.length();
        if (n < m) return addBinary(b, a);

        string result = "";
        int carry = 0;
        int j = m - 1;

        for (int i = n - 1; i >= 0; --i) {
            if (a[i] == '1')
                ++carry;
            if (j >= 0 && b[j--] == '1')
                ++carry;
            if (carry % 2 == 1)
                result += '1';
            else
                result += '0';

            carry /= 2;
        }
        
        if (carry == 1)
            result += '1';
        
        reverse(result.begin(), result.end());
        return result;
    }
};
