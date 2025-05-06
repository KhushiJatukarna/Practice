//print fibonacci series till given limit
public class Program2 {
    //Using Recursion
    /* 
    public static int fibonacci(int n){
        if (n<=1) 
            return n;
        else
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String ar[]) {
        int limit=5;
        for(int i=0;i<limit;i++){
            System.out.print(fibonacci(i)+" ");
        }
    } */

    //Without using Recursion
    public static void main(String[] args){
        int f1=0;
        int f2=1;
        int count=6;
        if(count==0){
        System.out.println(f1);
        }
        else if (count==1) {
            System.out.println(f1+""+f2);
        }
        else{
            System.out.print(f1+" "+f2+" ");
            for(int i=3;i<=count;i++){
                int fib=f1+f2;
                System.out.print(fib+" ");
                f1=f2;
                f2=fib;
            }
        }
    }



}
