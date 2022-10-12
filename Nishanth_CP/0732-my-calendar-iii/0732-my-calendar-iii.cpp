class MyCalendarThree {
public:
    // set<pair<int,int>> ar;
    // vector<pair<int,int>> ar;
    map<int,int> ar;
    int max_p = 0;
    MyCalendarThree() {
        
    }
    
    int book(int start, int end) {
        
        ar[start]++;
        ar[end]--;
        int ini =0;
        for(auto i:ar){
            ini += i.second;
            max_p = max(max_p,ini);
        }
        return max_p;
        
//         ar.push_back({start,end});
//         sort(ar.begin(),ar.end());
//         int ini =1, i  =1,j=0;
//         while(i<ar.size() && j<ar.size()){
//             if(ar[i].first < ar[j].second){
//                 ini++;
//                 if(ini > max_p){
//                     max_p = ini;
//                 }
//                 i++;
//             }
//             else{
//                 ini--;
//                 j++;
//             }
//         }
//         return max_p;
        
// //         ar.insert({start,en
        
    }
};

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree* obj = new MyCalendarThree();
 * int param_1 = obj->book(start,end);
 */