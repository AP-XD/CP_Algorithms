class Solution {
public:
    int solution(int n,int k,vector<int>& v,int idx)
    {
        if(v.size()==1)
            return v[0];
        idx=(idx + (k-1))%v.size();
        v.erase(v.begin()+idx);
        return solution(n,k,v,idx);
    }
    int findTheWinner(int n, int k) {
        // if(n==1)
        //     return 1;
        // return (findTheWinner(n-1,k)+ k-1)%n+1;
        vector<int> nums;
        for(int i=1;i<=n;i++)
            nums.push_back(i);
        return solution(n,k,nums,0);
    }
};