package RecursionBackTracking;

public class Multiply2NumbersWithoutMultiplying {
    public static int multiply(int a,int b){
        if(a==0 || b==0){
            return 0;
        }
        return b+multiply(a-1,b);
    }

    public static void main(String[] args) {
        int a =-6;
        int b =-3;
        boolean flag1=true;
        boolean flag2=true;
        if(a<0){
            a=a*-1;
            flag1=false;
        }
        if(b<0){
            b=b*-1;
            flag2=false;
        }
        if((flag1 && flag2) ||(!flag1 && !flag2)) {
            System.out.println(multiply(a,b));
        }else
            System.out.println(-1*multiply(a,b));
    }
}
