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

void solve(TreeNode* root,vector<int> &ar){
    if(root==NULL) return;
    
    if(root->left!=NULL) solve(root->left,ar);
    ar.push_back(root->val);
    if(root->right!=NULL) solve(root->right,ar);
    
}
class Solution {
public:
    
    bool findTarget(TreeNode* root, int k) {
        vector<int> ar;
        solve(root,ar);
        map<int,int> br;
        for(int i:ar){
            br[i]++;
        }
        for(int i=0;i<ar.size()-1;i++){
            int ta  = k - ar[i];
            br[ar[i]]--;
            if(br[ta]!=0){
                return true;
            }
        }
        return false;
        
    }
};