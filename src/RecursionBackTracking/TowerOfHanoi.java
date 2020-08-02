package RecursionBackTracking;

public class TowerOfHanoi {
    public static int toh(int n,int a,int b,int c){
        if(n==0 || n==1){
            return 1;
        }
        int count=toh(n-1,a,c,b);
        count++;
        count=toh(n-1,b,a,c);
        return count;
    }
    public static void print(int n,char a,char b,char c){
        if(n==0){
            return;
        }
        print(n-1,a,c,b);
        System.out.println("Move "+n+" from "+a+" to be "+c);
        print(n-1,b,a,c);
    }

    public static void main(String[] args) {
        print(3,'a','b','c');
    }
}
