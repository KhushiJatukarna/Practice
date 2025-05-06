//WAP to check first unique character in a string. 
//Given a string s, find the non-repeating character in it and return its index.
//if it does not exist, return -1. 
//input--lovemeetcode
//output--2
public class Program32 {
    public static void main(String[] args){
       String str="aabbcchddeehm";
       int i;
       for(i=0; i<str.length(); i++){
            boolean flag=true;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j) && i!=j){
                    flag=false;
                    break;
                }
            }    
            if(flag==true){
                System.out.println(i);
                break;
            }
        }
        if(i==str.length()){
            System.out.println("-1");
        }       
    }
}
