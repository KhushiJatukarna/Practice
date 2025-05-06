//Reverse a string by word.
//input--Today is Monday
//output--yadot si yadnom
//(All capital letters will also need to convert to lower case)
public class Program29 {
    public static void main(String[] ar){
        String str="Today is Monday";
        str=str.toLowerCase();
        String[] strArray=str.split(" ");
        /* 
        for(int i=0; i<strArray.length; i++){
            String temp=strArray[i];
            for(int j=temp.length()-1;j>=0; j--){
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
        */

        for(int i=0; i<strArray.length; i++){
            StringBuilder sb=new StringBuilder(strArray[i]);
            System.out.print(sb.reverse()+" ");
        }
        

    }
}
