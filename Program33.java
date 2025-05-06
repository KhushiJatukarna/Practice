//WAP to remove duplicates from array using hashmap.
//input--[7,1,2,2,3,4,4,6,4,5,5]
//output--[7,1,2,3,4,6,5]
import java.util.*;
public class Program33 {
    public static void main(String[] ar){
        int[] arr={7,1,2,2,3,4,4,6,4,5,5};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
            int count=hm.get(arr[i]);
            hm.put(arr[i],++count);           
            }
            else{
                hm.put(arr[i],1);
                System.out.print(arr[i]+" ");  //[7 1 2 3 4 6 5]
            }
        }       
        System.out.println("\n"+hm);  //{1=1, 2=2, 3=1, 4=3, 5=2, 6=1, 7=1}
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                System.out.print(i+" ");  //[1 3 6 7]
            }
        }
        System.out.println();
        for(int i:hm.keySet()){
            if(hm.get(i)>1){
                System.out.print(i+" ");  //[2 4 5]
            }
        }
    }
}

