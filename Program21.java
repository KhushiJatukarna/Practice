//Input-- My name is Khushi Sharma.my sister's  name is Akanksha Sharma.
//Output-- s=1, name=2, is=2, khushi=1, akanksha=1, my=2, sharma=2, sister=1
import java.util.*;
public class Program21 {
    public static void main(String[] args){
        String str=" My name is Khushi Sharma.my sister's  name is Akanksha Sharma.";
        System.out.println(str);
        str=str.toLowerCase();
        System.out.println(str);
        str=str.replaceAll("[.']"," "); 
        System.out.println(str);
        str=str.replace("  "," ");
        System.out.println(str);
        str=str.trim();
        System.out.println(str);
        String[] strArr=str.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<strArr.length;i++){
            if(hm.containsKey(strArr[i])){
                int count=hm.get(strArr[i]);
                hm.put(strArr[i],++count);
            }
            else{
                hm.put(strArr[i],1);
            }
        }
        System.out.println(hm);
        
    }
}
