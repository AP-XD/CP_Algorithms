class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> ans(numRows);
        //the first row
        // vector<int> v(1);
        // v[0]=1;
        // ans[0]=v;
        // for(int i=2;i<=numRows;i++)
        // {
        //     vector<int> v(i);
        //     //setting the first and elements as 1
        //     v[0]=1;
        //     v[i-1]=1;
        //     for(int j=1;j<i-1;j++)
        //         v[j]=ans[i-2][j-1]+ans[i-2][j];
        //     ans[i-1]=v;
        // }
        // return ans;
        for(int i=0;i<numRows;i++)
        {
            ans[i].resize(i+1);
            ans[i][0]=1;
            ans[i][i]=1;
            for(int j=1;j<i;j++)
            {
                ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }
        }
        return ans;
    }
};