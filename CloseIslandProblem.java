class Solution
{
    static void help(int arr[][],int i,int j,int N,int M){
        if(i<0 || j<0 || i==N || j==M || arr[i][j]==0)return;
        arr[i][j]=0;
        help(arr,i+1,j,N,M);
        help(arr,i-1,j,N,M);
        help(arr,i,j+1,N,M);
        help(arr,i,j-1,N,M);
    }
    public int closedIslands(int[][] matrix, int N, int M)
    {
        // Code here
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]==1){
                    if(i==0 || j==0 || i==N-1 || j==M-1){
                        help(matrix,i,j,N,M);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]==1){
                    ans++;
                    help(matrix,i,j,N,M);
                }
            }
        }
        return ans;
    }
    
}
https://practice.geeksforgeeks.org/problems/find-number-of-closed-islands/1