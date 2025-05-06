import java.util.*;
public class Program59 {
    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter value of n");
        int n=s1.nextInt();
        int sum=0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                sum=sum+i;
            }
        }
        System.out.println("Sum of prime no from 1 to n "+ sum);
    }
}