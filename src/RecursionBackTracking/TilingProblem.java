package RecursionBackTracking;

public class TilingProblem {
    //4*n block 4*1 tile size
    public static int tiling(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return tiling(n-1)+tiling(n-4);
    }
}
