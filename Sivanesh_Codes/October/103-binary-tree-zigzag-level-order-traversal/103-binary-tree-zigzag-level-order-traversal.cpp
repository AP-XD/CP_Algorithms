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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        if(root==nullptr) return ans;
        queue<TreeNode*> q;
        q.push(root);
        int flag=1;
        while(!q.empty())
        {
            int n=q.size();
            vector<int> v(n);
            for(int i=0;i<n;i++)
            {
                TreeNode* cur=q.front();
                q.pop();
                int pos=(flag)? i:(n-1-i);
                v[pos]=cur->val;
                if(cur->left!=nullptr) q.push(cur->left);
                if(cur->right!=nullptr) q.push(cur->right);
            }
            flag=!flag;
            ans.push_back(v);
        }
        return ans;
    }
};