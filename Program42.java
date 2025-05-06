//add elements of array like simple sum in maths
import java.util.*;
public class Program42 {
    public static void main(String[] args){
        int[] arr1={9,9,9,7,8,6,4};
        int[] arr2={9,1,};
        
        int carry=0;
        ArrayList <Integer> al= new ArrayList<>();

        int i=arr1.length-1;
        int j=arr2.length-1;

        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0){
                sum+=arr1[i];
                i--;
            }
            if(j>=0){
                sum+=arr2[j];
                j--;
            }
            carry=sum/10;
            al.add(sum%10);
        }
        Collections.reverse(al);
        System.out.println(al);
    }  
}
