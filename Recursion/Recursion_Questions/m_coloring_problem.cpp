#include<bits/stdc++.h>

using namespace std;

bool check_col(int node,int color[],int m,int N,bool graph[101][101],int col) {
    for(int i=0;i<N;i++){
        if(i!=node&&graph[i][node]==1&&color[i]==col)
        return false;
    }
    return true;
}

bool solve(int node, int color[], int m, int N, bool graph[101][101]) {
    if(node==N)
        return true;
    for(int c=1;c<=m;c++){
        if(check_col(node,color,m,N,graph,c)){
            color[node]=c;
            if(solve(node+1,color,m,N,graph))
            return true;
            color[node]=0;
        }
    }
    return false;
}

bool graphColoring(bool graph[101][101], int m, int N) {
    int color[N]={0};
    if(solve(0,color,m,N,graph))
    return true;
    else
    return false;
}


int main() {
  int N = 4;
  int m = 3;

  bool graph[101][101];
  memset(graph, false, sizeof graph);

  // Edges are (0, 1), (1, 2), (2, 3), (3, 0), (0, 2)
  graph[0][1] = 1; graph[1][0] = 1;
  graph[1][2] = 1; graph[2][1] = 1;
  graph[2][3] = 1; graph[3][2] = 1;
  graph[3][0] = 1; graph[0][3] = 1;
  graph[0][2] = 1; graph[2][0] = 1;
  
  cout << graphColoring(graph, m, N);

}