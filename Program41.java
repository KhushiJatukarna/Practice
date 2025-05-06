import java.util.*;
public class Program41 {
    public static void main(String[] args) {
        int[] arr1={4,5,2,5,7,4};
        int[] arr2={4,5,8};
        ArrayList<Integer> al=new ArrayList<Integer>();
        int gap=0;
        int sum=0;
        int carry=0;
        if(arr1.length>arr2.length){
             gap=arr1.length-arr2.length;
            for(int i=arr2.length-1;i>=0;i--){
                sum=arr1[i+gap]+arr2[i]+carry;
                carry=sum/10;
                sum=sum%10;
                al.add(sum);
            }
            for(int j=gap-1;j>=0;j--){
                sum=arr1[j]+carry;
                carry=sum/10;
                sum=sum%10;
                al.add(sum);
            }
        }
        
        else{
            gap=arr2.length-arr1.length;
            for(int i=arr1.length-1;i>=0;i--){
                sum=arr1[i]+arr2[i+gap]+carry;
                carry=sum/10;
                sum=sum%10;
                al.add(sum);
            }
            for(int j=gap-1;j>=0;j--){
                sum=arr2[j]+carry;
                carry=sum/10;
                sum=sum%10;
                al.add(sum);
            }
        }
        if(carry>0){
            al.add(carry);
        }   
        Collections.reverse(al);
        System.out.println(al);
    }
}

