//Arrange all zeros at the last of the array
//input--{0,0,1,0,1,1,0}
//output--{1,1,1,0,0,0,0}
import java.util.*;
public class Program28 {
    public static void main(String[] args){
        int[] arr={0,0,1,0,1,1,0};
        /*
        int count=arr.length-1;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count--;
            }
        }
        */
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
