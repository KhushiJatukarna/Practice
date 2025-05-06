//int[] number =new int[]{102,202,500,80,20,10};
//o/p-find the largest and smallest number using collection.

import java.util.*;
public class Program30 {
    public static void main(String[] arg){
        int arr[]={102,202,500,80,20,300};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            al.add(arr[i]);
        }
        System.out.println("Largest no. is "+Collections.max(al));
        System.out.println("Smallest no. is "+Collections.min(al));
    }
    
}
