//print occurance of each numbers from the given array.
//input-- arr={1,2,3,4,5,7,5,6,1,2,3}
//output-- 1=2, 2=2, 3=2, 4=1, 5=2, 6=1, 7=1
import java.util.*;
public class Program25 {
    public static void main(String[] args){       
      int[] arr={1,2,3,4,5,7,5,6,1,2,3};
      HashMap<Integer, Integer> hm= new HashMap<>();
      for(int i=0;i<arr.length;i++){
          if(hm.containsKey(arr[i])){
              int count=hm.get(arr[i]);
              hm.put(arr[i],++count);
          }
          else{
              hm.put(arr[i],1);
          }
      }
        System.out.println(hm);
    }
}