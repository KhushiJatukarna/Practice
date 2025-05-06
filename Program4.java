//check if the given array is palindrome or not.
public class Program4 {
    public static void main(String ar[]){
        int num=12321,rev=0;
        int temp=num;
        while(num>0){
            rev=rev * 10 + num % 10;
            num/=10;
        }
        if(rev==temp)
        System.out.println(temp + " is a Palindrome No.");
        else 
        System.out.println(temp + " is not a Palindrome No.");

    }
    
}
