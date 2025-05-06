//print factorial of given no. 

import java.util.Scanner;

public class Program3 {
    //Using Recursion
    /*
    public static int factorial(int n){
        if (n<=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }

    }
    public static void main(String ar[]){
        int num=5;
        System.out.println("Factorial of " + num + " is " + factorial(num) );
    } 
    */
    public static void main(String[] args) {
    System.out.println("enter a no.");
    Scanner s1=new Scanner(System.in);
    int num=s1.nextInt();
    int fact=1;
    for(int i=num; i>0; i--){
        fact=fact*i;
    }
    System.out.println("Factorial is: "+fact);
    
    }
    
    
}
