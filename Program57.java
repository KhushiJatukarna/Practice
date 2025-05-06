//search in sorted and rotated array
public class Program57 {
    public static int search(int arr[] ,int tar ,int beg, int end){
        if(beg>end){
            return -1;
        }
        
        int mid=beg+(end-beg)/2;
        if(arr[mid]==tar){
            return mid;
        }
        
        if(arr[beg]<=arr[mid]){
            if(arr[beg]<=tar && tar<=arr[mid]){
                return search(arr,tar,beg,mid);
            }
            else{
            return search(arr,tar,mid+1,end);
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[end]){
                return search(arr,tar,mid+1,end);
            }
            else{
                return search(arr,tar,beg,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=7;
        int tarIdx=search(arr,target,0,arr.length-1);
        System.out.println(tarIdx);
    }
}

