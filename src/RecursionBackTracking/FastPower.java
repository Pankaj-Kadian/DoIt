package RecursionBackTracking;
//a^b
public class FastPower {
    public static long power(int a,int b){
        if(a==1 || a==0){
            return a;
        }
        if(b==0){
            return 1;
        }
        long ans = power(a,b/2);
        if(b%2==0){
            ans=ans*ans;
        }else{
            ans=ans*ans*a;
        }
        return ans;
    }
}
