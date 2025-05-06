//print the missing numbers in the given array.
//input--[1,2,3,4,5,10]
//output--6,7,8,9
public class Program51 {
    public static void main(String ar[]){
        int arr[]={1,2,3,4,5,10};
        int num=1;
        for (int i=0;i<arr.length;i++){
           while(num<arr[i]){
            System.out.println(num);
            num++;
           }
           num++;
        }
    }
    
}
