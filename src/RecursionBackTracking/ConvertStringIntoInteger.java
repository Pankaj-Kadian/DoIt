package RecursionBackTracking;

public class ConvertStringIntoInteger {
    public static int solve(String str,int n){
        if(n==0){
            return 0;
        }
        int ans = Integer.parseInt(str.charAt((n-1))+"")+10*solve(str,n-1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("0012034",7));
    }
}
