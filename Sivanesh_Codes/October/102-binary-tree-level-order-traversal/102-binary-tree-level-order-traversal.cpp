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
    // vector<vector<int>> levelOrder(TreeNode* root) {
    //     vector<vector<int>> ans;
    //     if(root==nullptr)
    //         return ans;
    //     queue<TreeNode*> q;
    //     q.push(root);
    //     while(q.size()>0)
    //     {
    //         int size=q.size();
    //         vector<int> v;
    //         for(int i=0;i<size;i++)
    //         {
    //             TreeNode* cur=q.front();
    //             q.pop();
    //             v.push_back(cur->val);
    //             if(cur->left!=nullptr) q.push(cur->left);
    //             if(cur->right!=nullptr) q.push(cur->right);
    //         }
    //         ans.push_back(v);
    //     }
    //     return ans;
    // }
    vector<vector<int>> levelOrder(TreeNode* root)
    {
        vector<vector<int>> ans;
        if(root==nullptr) return ans;
        //vectr<int> v;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            vector<int> v;
            int n=q.size();
            for(int i=0;i<n;i++)
            {
                TreeNode* cur=q.front();
                q.pop();
                v.push_back(cur->val);
                if(cur->left!=nullptr) q.push(cur->left);
                if(cur->right!=nullptr) q.push(cur->right);
            }
            ans.push_back(v);
        }
        return ans;
    }
};