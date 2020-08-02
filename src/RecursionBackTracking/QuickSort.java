package RecursionBackTracking;

public class QuickSort {
    public static int partition(int[] A,int start,int end){
        int pivot = A[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(A[j]<=pivot){
                i++;
                int temp = A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        int temp=A[i+1];
        A[i+1]=A[end];
        A[end]=temp;
         return i+1;
    }
    public static void quickSort(int[] A,int start,int end){
        if(start<end){
            int pivot = partition(A,start,end);
            quickSort(A,start,pivot-1);
            quickSort(A,pivot+1,end);
        }
    }

    public static void main(String[] args) {

    }
}
