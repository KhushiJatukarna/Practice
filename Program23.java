//print duplicate words in given string using hashmap.
//input-- " My name is Khushi Sharma.my name is  Akanksha Sharma "
//output-- my, name, is, sharma

import java.util.*;
class Program23 {
    public static void main(String[] args) {
        String str=" My name is Khushi Sharma.my name is  Akanksha Sharma ";
        str=str.toLowerCase();
        System.out.println(str);
        
        str=str.replace("."," ");
        str=str.replace("  "," ");
        str=str.trim();
        System.out.println(str);
        
        String[] strArray=str.split(" ");
        HashMap<String,Integer> hm= new HashMap<>();
        for(int i=0;i<strArray.length;i++){
            if(hm.containsKey(strArray[i])){
                int count=hm.get(strArray[i]);
                hm.put(strArray[i],++count);
            }
            else{
                hm.put(strArray[i],1);
            }
        }
        for(String i: hm.keySet()){
           // System.out.println(hm.get(i));
            if(hm.get(i)!=1){
                System.out.print(i+", ");
            }
        }
        
    }
}