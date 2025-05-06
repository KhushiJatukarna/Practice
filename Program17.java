//Merge Sort
import java.util.*;
public class Program17 {
    public static void divide(int arr[],int beg, int end){
        if(beg>=end){
            return;
        }
        int mid=beg+(end-beg)/2;
        divide(arr, beg, mid);
        divide(arr, mid+1, end);
        merge(arr,beg,mid,end);
    }   

    public static void merge(int arr[], int beg, int mid, int end){
        int temp[]=new int[end-beg+1];
        int i=beg;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=end){
            temp[k++]=arr[j++];
        }
        for(k=0, i=beg; k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
}