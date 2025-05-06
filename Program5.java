//check if the given array is palindrome or not.
public class Program5 {
    public static void main(String ar[]){
        int arr[]={1,2,3,4,3,2,1};
        int l=arr.length;
        boolean isPalindrome = true; 
        for(int i=0;i<l/2;i++){
            if(arr[i]!=arr[l-1-i]){
                isPalindrome = false;
                System.out.println("\nArray is not palindrome");
                break;
            }  
        }    
        if (isPalindrome) {
            System.out.println("\nArray is palindrome");
        }
    }    
}
