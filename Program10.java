//binary search in an array
public class Program10 {
    public static void main(String[] args) {
        int[] ar={3,7,11,13,14,25,27,38};
        int beg=0;
        int end=ar.length-1;
        int ele=27;
        int index=-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            if(ar[mid]<ele){
                beg=mid+1;
            }
            else if(ar[mid]>ele){
                end=mid-1;
            }
            else{
                index=mid;
                break;
            }
        }
    
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at index: "+index);
        }
    }
}

