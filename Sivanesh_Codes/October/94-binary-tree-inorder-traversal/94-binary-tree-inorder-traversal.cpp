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
    // vector<int> ans;
    // vector<int> inorderTraversal(TreeNode* root) {
    //     if(root==nullptr)
    //         return ans;
    //     inorderTraversal(root->left);
    //     ans.push_back(root->val);
    //     inorderTraversal(root->right);
    //     return ans;
    // }
    //iterative solution
    vector<int> inorderTraversal(TreeNode* root)
    {
        vector<int> ans;
        if(root==nullptr) return ans;
        stack<TreeNode*> s;
        while(true){
            if(root!=nullptr){
                s.push(root);
                root=root->left;
            }
            else{
                if(s.size()==0) break;
                TreeNode *cur=s.top();
                s.pop();
                ans.push_back(cur->val);
                root=cur->right;
            }
        }
        return ans;
    }
};