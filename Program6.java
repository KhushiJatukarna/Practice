//check if the given number is armstrong or not.
import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);
        do { 
            System.out.println("Enter the number");
            int num=s1.nextInt();
            int num1=num;
            int pow=0;
            while(num1>0){
                num1/=10;
                pow++;
            }
            System.out.println("Power = "+pow);
            int tmp=num;
            int arm=0;
            while(tmp>0){
                arm=arm+(int)Math.pow(tmp%10, pow);
                tmp/=10;
            }
            if(arm==num){
                System.out.println("Nums is Armstrong "+arm+" "); 
            }
            if(!s1.nextLine().isEmpty()){
                break;
            }
        } while (true);
        s1.close();
    }    
}
