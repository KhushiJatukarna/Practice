//Program to find all lonely numbers in the array using sorting.
//input--[10,6,5,8,2,4]
//output--[10,8,2]

import java.util.*;

class Program36{
    public static void main(String ar[]){
        int[] arr={10,6,5,8,2,4};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}