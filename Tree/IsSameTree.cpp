
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};


class IsSameTree {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (p == nullptr && q == nullptr)
            return true;
        // one of p and q is null
        if (q == nullptr || p == nullptr)
            return false;
        if (p->val != q->val)
            return false;

        return isSameTree(p->right, q->right) && isSameTree(p->left, q->left);
    }
};
