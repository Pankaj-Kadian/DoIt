package RecursionBackTracking;

public class BinarySearch {
    public static int binarySearch(int[] arr ,int start,int end,int search){
        if(end<start){
            return -1;
        }
        int mid = (start+end)/2;
        if(arr[mid]==search){
            return mid+1;
        }
        if(arr[mid]>search){
            return binarySearch(arr,start,mid-1,search);
        }
        return binarySearch(arr,mid+1,end,search);
    }
}
