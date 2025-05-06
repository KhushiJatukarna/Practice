//Input--Khushijatukarna@gmail.com
//Output--a=4, c=1, g=1, h=2, i=2, j=1, k=2, l=1, m=2, n=1, o=1, r=1, s=1, t=1, u=2
import java.util.*;
public class Program20 {
    public static void main(String[] args){
        String str=" KhushiJatukaRna@gmail.com";
        System.out.println(str);
        str=str.trim();
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println(str);
        str=str.replaceAll("[^A-z]","");
        System.out.println(str);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                int count=hm.get(str.charAt(i));
                hm.put(str.charAt(i),++count);
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }
        System.out.println(hm);

    }
    
}
