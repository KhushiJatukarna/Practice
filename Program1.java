//check if the given number is prime or not. 
public class Program1 {
    public static void main(String args[]){
        int num=7;
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                isPrime=false;
                System.out.println("Not a Prime no.");
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime no.");
        }
    }
    
}
