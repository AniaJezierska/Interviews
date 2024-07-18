#include <climits> // Dla INT_MAX i INT_MIN
#include <iostream>

class ReverseInteger {
public:
    int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && digit > 7)) return 0;
            if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && digit < -8)) return 0;

            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
};

int main() {
    ReverseInteger solution;
    int num1 = 123;
    int num2 = -123;
    int num3 = 120;

    std::cout << "Reverse of " << num1 << " is " << solution.reverse(num1) << std::endl; // 321
    std::cout << "Reverse of " << num2 << " is " << solution.reverse(num2) << std::endl; // -321
    std::cout << "Reverse of " << num3 << " is " << solution.reverse(num3) << std::endl; // 21

    return 0;
}

