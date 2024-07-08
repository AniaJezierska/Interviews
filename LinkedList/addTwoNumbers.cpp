#include <iostream>

class ListNode {
public:
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class AddTwoNumbers {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummyHead = new ListNode(0);
        ListNode* p = l1;
        ListNode* q = l2;
        ListNode* current = dummyHead;
        int carry = 0;

        while (p != nullptr || q != nullptr) {
            int x = (p != nullptr) ? p->val : 0;
            int y = (q != nullptr) ? q->val : 0;

            int sum = carry + x + y;
            carry = sum / 10;
            current->next = new ListNode(sum % 10);
            current = current->next;

            if (p != nullptr) p = p->next;
            if (q != nullptr) q = q->next;
        }

        if (carry > 0) {
            current->next = new ListNode(carry);
        }

        return dummyHead->next;
    }
};

int main() {
    ListNode* l1 = new ListNode(2);
    l1->next = new ListNode(4);
    l1->next->next = new ListNode(3);

    ListNode* l2 = new ListNode(5);
    l2->next = new ListNode(6);
    l2->next->next = new ListNode(4);

    AddTwoNumbers solution;
    ListNode* result = solution.addTwoNumbers(l1, l2);

    while (result != nullptr) {
        std::cout << result->val;
        if (result->next != nullptr) {
            std::cout << " -> ";
        }
        result = result->next;
    }
    std::cout << std::endl;

    return 0;
}
