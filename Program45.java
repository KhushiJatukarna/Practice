//Find the median of an array
import java.util.*;
public class Program45 {
    
    public static void main(String[] args) {
        int[] ar={1, 3, 4, 2, 7, 5, 8, 6};
        System.out.println("Original array: "+Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println("Sorted array: "+Arrays.toString(ar));
        float median=0;
       
        if(ar.length%2==0){
         median=(ar[(ar.length-1)/2]+ar[ar.length/2])/2.0f;
        }
        else{
             median=ar[ar.length/2];
        }
        System.out.println("Median is "+median);
    }
}

