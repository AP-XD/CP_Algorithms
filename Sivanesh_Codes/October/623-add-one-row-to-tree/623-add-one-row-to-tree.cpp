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
    TreeNode* addOneRow(TreeNode* root, int val, int depth) {
        vector<TreeNode*> v;
        queue<TreeNode*> q;
        q.push(root);
        int c=1;
        if(depth==1)
        {
            TreeNode *new1=new TreeNode();
            new1->val=val;
            new1->left=root;
            return new1;
        }
        while(q.size()>0)
        {
            int x=q.size();
            for(int i=0;i<x;i++)
            {
                TreeNode* cur=q.front();
                q.pop();
                if(c==depth-1)
                    v.push_back(cur);
                if(cur->left!=nullptr) q.push(cur->left);
                if(cur->right!=nullptr) q.push(cur->right);
            }
            if(c==depth-1)
                break;
            c++;
        }
        for(int i=0;i<v.size();i++)
        {
            TreeNode* cur=v[i];
                TreeNode *new1=new TreeNode();
                new1->val=val;
                new1->left=cur->left;
                cur->left=new1;
                TreeNode *new2=new TreeNode();
                new2->val=val;
                new2->right=cur->right;
                cur->right=new2;
        }
        return root;
    }
};