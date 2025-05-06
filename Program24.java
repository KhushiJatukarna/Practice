//print all duplicate words in the given string using hashset.
//input--" My name is Khushi Sharma.my name is  Akanksha Sharma "
//output--my, name, is, sharma
import java.util.*;
public class Program24 {
    public static void main(String[] args) {
        String str=" My name is Khushi Sharma.my name is  Akanksha Sharma ";
        System.out.println(str);
        
        str=str.toLowerCase();
        System.out.println(str);
        
        str=str.replace("."," ");
        str=str.replace("  "," ");
        str=str.trim();
        System.out.println(str);
        
        String[] strArray=str.split(" ");
        HashSet<String> hs= new HashSet<>();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<strArray.length;i++){           
            if (!hs.add(strArray[i])) {  
                if (!al.contains(strArray[i])) {  
                    al.add(strArray[i]);
                }
            }          
        }
         System.out.println(hs); 
        System.out.println(al);
       
        
    }
}
    

