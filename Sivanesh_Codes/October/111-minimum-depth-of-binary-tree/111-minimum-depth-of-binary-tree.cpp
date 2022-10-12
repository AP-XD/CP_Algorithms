;/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int minDepth(TreeNode* root) {
        if(root==nullptr)
            return 0;
        if(root->left == nullptr && root->right == nullptr)
            return 1;
        int lh=1e6;
        int rh=1e6;
        if(root->left!=nullptr)
            lh=minDepth(root->left);
        if(root->right!=nullptr)
            rh=minDepth(root->right);
        return 1+min(lh,rh);
    }
};