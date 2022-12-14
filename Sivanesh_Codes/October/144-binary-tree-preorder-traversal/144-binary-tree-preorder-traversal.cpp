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
    // Iterative soltion using stack
    //vector<int> ans;
    // vector<int> preorderTraversal(TreeNode* root) {
    //     // if(root==nullptr)   return ans;
    //     // ans.push_back(root->val);
    //     // preorderTraversal(root->left);
    //     // preorderTraversal(root->right);
    //     // return ans;
    //     vector<int> ans;
    //     if(root == nullptr) return ans;
    //     stack<TreeNode*> s;
    //     s.push(root);
    //     while(s.size()>0)
    //     {
    //         TreeNode* cur=s.top();
    //         s.pop();
    //         ans.push_back(cur->val);
    //         if(cur->right!=nullptr) s.push(cur->right);
    //         if(cur->left!=nullptr) s.push(cur->left);
    //     }
    //     return ans;
    // }
    vector<int> preorderTraversal(TreeNode* root)
    {
        vector<int> ans;
        if(root==nullptr) return ans;
        stack<TreeNode*> s;
        s.push(root);
        while(!s.empty())
        {
            TreeNode* cur=s.top();
            s.pop();
            ans.push_back(cur->val);
            if(cur->right!=nullptr) s.push(cur->right);
            if(cur->left!=nullptr) s.push(cur->left);
        }
        return ans;
    }
};