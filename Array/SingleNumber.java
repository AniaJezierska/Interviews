/**
 * Concept:
 * If we take XOR of zero and some bit, it will return that bit:
 * a ⊕ 0 = a
 * If we take XOR of two same bits, it will return 0:
 * a ⊕ a = 0
 * a ⊕ b ⊕ a = (a ⊕ a) ⊕ b = 0 ⊕ b = b
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int a = 0;

        for (int i : nums) {
            // operation XORs the current value of 'a' with the value of the current element 'i'
            a ^= i;
        }
        return a;
    }
}


/* Input: nums = [2,2,1]
Output: 1

Input: nums = [4,1,2,1,2]
Output: 4
 */
