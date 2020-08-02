package RecursionBackTracking;

public class RatInMaze {
    public static int solve(int[][] maze,int n,int i,int j,int[][] visited){
        if(i==n-1 && j==n-1){
            if(maze[i][j]!=1){
                return 0;
            }
            return 1;
        }
        int ans=0;
        if(i<0 || j<0 || i>=n || j>=n){
            return 0;
        }
        if(visited[i][j]==0 && maze[i][j]==1){
            visited[i][j]=1;
            ans+=solve(maze,n,i+1,j,visited);
            ans+=solve(maze,n,i,j+1,visited);
            visited[i][j]=0;
            return ans;
        }
        return ans;
    }
}
