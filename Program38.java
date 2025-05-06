//Ex-1: input--"the sky is blue"  output--"blue is sky the"
//Ex-2: input--" hello world "  output--"world hello"
//Ex-3: input--"a good  example"  output--"example good a"
public class Program38 {
    public static String reverseWords(String s){
        s=s.trim();
        s=s.replaceAll("\\s+"," ");
        String[] strArray=s.split(" ");
        String ans="";
        for(int i=strArray.length-1; i>=0; i-- ){
            if(i==0){
                ans=ans+strArray[i];
            }
            else{
                ans=ans+strArray[i]+" ";
            }
        }
        return ans;
    }
    public static void main(String[] ar){
        String str=" hello world ";
        System.out.println(reverseWords(str));
    }
    
}
