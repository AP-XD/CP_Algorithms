#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    
    bool checkQueenPos(vector<string> chess,int row,int col, int n){
        for(int j=0;j<col;j++){
            if(chess[row][j]=='Q')
                return false;
        }
        
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(chess[i][j]=='Q')
                return false;
        }
        
        for(int i=row,j=col;i<n&&j>=0;i++,j--){
            if(chess[i][j]=='Q')
                return false;
        }
        return true;
    }
    
   void solve(int col, vector < string > &pos, vector < vector < string >> & res, int n) {
       if(col==n){
            res.push_back(pos);
            return;
        }
        for(int row=0;row<n;row++){
            if(checkQueenPos(pos,row,col,n)){
                pos[row][col]='Q';
                solve(col+1,pos,res,n);
                pos[row][col]='.';
            }
        }
    }
    
    vector<vector<string>> solveNQueens(int n) {
        vector < vector < string >> ans;
        vector < string > board(n);
        string s(n, '.');
        for (int i = 0; i < n; i++) {
            board[i] = s;
        }
        solve(0, board, ans, n);
        return ans;
    }
};
int main() {
  int n = 4; // we are taking 4*4 grid and 4 queens
  Solution obj;
  vector < vector < string >> ans = obj.solveNQueens(n);
  for (int i = 0; i < ans.size(); i++) {
    cout << "Arrangement " << i + 1 << "\n";
    for (int j = 0; j < ans[0].size(); j++) {
      cout << ans[i][j];
      cout << endl;
    }
    cout << endl;
  }
  return 0;
}