//swapping two numbers with and without temp variable.
public class Program7
 {
    public static void main(String[] args){
        int a=23;
        int b=31;        
        System.out.println("numbers before swapping:\nnum1="+a+"\nnum2="+b);

        /*
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("numbers after swapping:\nnum1="+a+"\nnum2="+b);
        */ 
        
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers after swapping:\nnum1="+a+"\nnum2="+b);

        


    }
}
