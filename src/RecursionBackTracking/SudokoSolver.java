package RecursionBackTracking;

public class SudokoSolver {
    public static void solve(int[][] sudoko,int i,int j,int n,int[] row,int[] col){
        if(i==n-1 && j==n-1){
            //   print matrix
            //   return true;
        }
        if(j==n){
            solve(sudoko,i+1,0,n,row,col);
        }
        if(sudoko[i][j]==-1){
            for(int k=1;k<9;k++){
                if(row[k]!=1 && col[k]!=1){
                    int sx=(i/3)*3;
                    int sy=(j/3)*3;
                    int flag=0;
                    for(int l=0;l<3;l++){
                        for(int m=0;m<3;m++){
                            if(sudoko[sx+l][sy+j]==k){
                                flag=1;
                                break;
                            }
                        }
                        if(flag==1){
                            break;
                        }
                    }
                    if(flag==0){
                        row[i]=1;
                        col[j]=1;
                        sudoko[i][j]=k;
                        solve(sudoko,i,j+1,n,row,col);
                        sudoko[i][j]=-1;
                        row[i]=0;
                        col[j]=0;
                    }
                }
            }
        }else
            solve(sudoko,i,j,n,row,col);
    }
}
