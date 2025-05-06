//Quick Sort
import java.util.*;
class Program18{
    public static void quickSort(int arr[],int beg,int end){
        if(beg>=end){
            return;
        }
        int pivot=partition(arr,beg,end);
        quickSort(arr,beg,pivot-1);
        quickSort(arr,pivot+1,end);
    }
    public static int partition(int arr[], int beg, int end) {
        int pivotEle=arr[end];
        int i=beg-1;
        for(int j=beg;j<end;j++){
            if(arr[j]<=pivotEle){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        } 
        i++;
        int temp=pivotEle;
        arr[end]=arr[i];
        arr[i]=temp; 
        return i;             
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,8,2,5};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}