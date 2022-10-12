/**
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
    bool hasPathSum(TreeNode* root, int targetSum) {
        if(root==nullptr)
            return false;
        if(root->left==nullptr && root->right==nullptr)
        {
            targetSum-=root->val;
            return targetSum==0;
        }
            
        bool op1=false;
        bool op2=false;
        if(root->left!=nullptr)op1=hasPathSum(root->left,targetSum-root->val);
        if(root->right!=nullptr)op2=hasPathSum(root->right,targetSum-root->val);
        return op1||op2;
    }
};