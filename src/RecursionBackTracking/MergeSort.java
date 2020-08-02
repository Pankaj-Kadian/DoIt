package RecursionBackTracking;

public class MergeSort {
    public static void merge(int[] A,int start,int end){
        int mid = (start+end)/2;
        int[] left = new int[mid-start+1];
        int[] right = new int[end-mid];
        for(int i=0;i<left.length;i++){
            left[i]=A[i+start];
        }
        for(int j=0;j<right.length;j++){
            right[j]=A[j+mid+1];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i< left.length && j< right.length){
            if(left[i]< right[j]){
                A[k]=left[i];
                i++;
                k++;
            }else{
                A[k]=right[j];
                j++;
                k++;
            }
        }
        while(i< left.length){
            A[k]= left[i];
            i++;
            k++;
        }
        while(j< right.length){
            A[k]=right[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] A,int start,int end){
        if(start<end){
            int mid = (start+end)/2;
            sort(A,start,mid);
            sort(A,mid+1,end);
            merge(A,start,end);
        }
    }
}
