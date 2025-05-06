import java.util.*;
class Program40 {
    public static void main(String[] args) {
        int[] arr1={4,5,3,2,5};
        int[] arr2={9,5,3,2,5};
        int[] ans=new int[arr1.length+1];
        int carry=0;
        for(int i=arr1.length-1;i>=0;i--){
            int sum=arr1[i]+arr2[i]+carry;
            carry=sum/10;
            sum=sum%10;
            ans[i+1]=sum;
        }
        ans[0]=carry;
        System.out.println(Arrays.toString(ans));
    }
}