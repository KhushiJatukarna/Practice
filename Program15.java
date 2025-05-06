//Insertion Sort
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={6,7,4,9,2,3};
        for(int i=1; i<arr.length; i++){
            int curr=i;
            int prev=i-1;
            int currValue=arr[curr];
            while(prev>=0 && arr[prev]>currValue){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=currValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}