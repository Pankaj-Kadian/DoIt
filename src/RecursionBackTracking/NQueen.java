package RecursionBackTracking;

public class NQueen {

    public static int solve(int[][] board,int n,int row,int[] col,int[] dia1,int[] dia2){
        if(row==n){
            return 1;
        }
        int ans=0;
        // column mai diff postion place
        for(int i=0;i<board[0].length;i++){
            if(col[i]!=1 && dia1[i-row+n]!=1 && dia2[i+row]!=1){
                col[i]=1;
                dia1[i-row+n]=1;
                dia2[i+row]=1;
                ans += solve(board, n, row+1, col, dia1, dia2);
                col[i]=0;
                dia1[i-row+n]=0;
                dia2[i+row]=0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=4;
        int[][] board = new int[n][n];
        int[] col = new int[n];
        int[] dia1 = new int[2*n];
        int[] dia2 = new int[2*n];
        System.out.println(solve(board,n,0,col,dia1,dia2));
      }
}
