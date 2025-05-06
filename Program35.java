//Find the occurance of each String from the given ArrayList.
//input---[Harsh, Khushi, Akanksha, Khushi, Shreya, Khushi]
//output---{Shreya=1, Akanksha=1, Khushi=3, Harsh=1}
import java.util.*;
class Program35{
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        al.add("Harsh");
        al.add("Khushi");
        al.add("Akanksha");
        al.add("Khushi");
        al.add("Shreya");
        al.add("Khushi");
        System.out.println(al);
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<al.size(); i++){
            if(hm.containsKey(al.get(i))){
                int count=hm.get(al.get(i));
                hm.put(al.get(i),++count);
            }
            else{
                hm.put(al.get(i),1);
            }
        }
        System.out.println(hm);
    }
}
