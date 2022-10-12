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
    int maxPathSum(TreeNode* root) {
        if(root==nullptr)
            return 0;
        int ans=INT_MIN;
        depth(root,&ans);
        return ans;
    }
    int depth(TreeNode* root,int* ans)
    {
        if(root==nullptr)
            return 0;
        int lh=depth(root->left,ans);
        int rh=depth(root->right,ans);
        if(lh<0) lh=0;
        if(rh<0) rh=0;
        *ans=max(*ans,lh+rh+root->val);
        return root->val+max(lh,rh);
    }
};