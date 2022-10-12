class Solution {
public:
    int minCost(string colors, vector<int>& neededTime) {
        int n=neededTime.size();
        int cost=0;
        for(int i=0;i<n-1;i++)
        {
            if(colors[i]==colors[i+1])
            {
                cost+=min(neededTime[i],neededTime[i+1]);
                if(neededTime[i]>neededTime[i+1])
                    neededTime[i+1]=neededTime[i];
            }
        }
        return cost;
    }
};