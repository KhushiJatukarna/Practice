//Arrange all zeros at the last of the array
//input--{0,0,1,0,1,1,0}
//output--{1,1,1,0,0,0,0}
import java.util.*;
public class Program27 {
    public static void main(String[] args){
        int[] arr={0,0,1,0,1,1,0};
        ArrayList <Integer> al0=new ArrayList<>();
        ArrayList <Integer> al1=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                al0.add(arr[i]);
            }
            else{
                al1.add(arr[i]);
            }
        }
        al1.addAll(al0);
        System.out.println(al1);
    }
}
