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
    //recursive solutoin
    // vector<int> ans;
    // vector<int> postorderTraversal(TreeNode* root) {
    //     if(root==nullptr) return ans;
    //     postorderTraversal(root->left);
    //     postorderTraversal(root->right);
    //     ans.push_back(root->val);
    //     return ans;
    // }
    
    //iterative solution 2 stack
    // vector<int> postorderTraversal(TreeNode* root)
    // {
    //     vector<int> ans;
    //     if(root==nullptr) return ans;
    //     stack<TreeNode*> s1;
    //     s1.push(root);
    //     while(!s1.empty())
    //     {
    //         TreeNode *cur=s1.top();
    //         s1.pop();
    //         ans.push_back(cur->val);
    //         if(cur->left!=nullptr) s1.push(cur->left);
    //         if(cur->right!=nullptr) s1.push(cur->right);
    //     }
    //     reverse(ans.begin(),ans.end());
    //     return ans;
    // }
    vector<int> postorderTraversal(TreeNode* root){
        vector<int> ans;
        if(root==nullptr) return ans;
        stack<TreeNode*> s;
        s.push(root);
        while(!s.empty())
        {
            TreeNode* cur=s.top();
            s.pop();
            ans.insert(ans.begin(),cur->val);
            if(cur->left!=nullptr) s.push(cur->left);
            if(cur->right!=nullptr) s.push(cur->right);
        }
        return ans;
    }
};