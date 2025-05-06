//input-- aabbbccccdddddeeeeee
//output-- a2b3c4d5e6
import java.util.*;
class Program19 {
   public static void main(String[] args){
       String str="aabbbccccdddddeeeeee";
       HashMap <Character,Integer> hm=new HashMap<>();
       for(int i=0; i<str.length(); i++){
            if(hm.containsKey(str.charAt(i))){
                int count=hm.get(str.charAt(i)); 
                hm.put(str.charAt(i),++count);
            }
           else{
               hm.put(str.charAt(i),1);
           }
       }
       System.out.println(hm);
       for (Character i : hm.keySet()) {
          System.out.print(i+""+hm.get(i));
       }
   }
}

