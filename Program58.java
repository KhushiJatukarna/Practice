import java.util.*;
public class Program58 {
    public static void main(String[] args) {
        String str="{a+b-[(e/2)]*(c-d)]}";
        //str = str.replaceAll("[^{}\\[\\]()]", "");
        
        Stack<Character>st=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                  st.push(str.charAt(i));
            }
            else{
                if(str.charAt(i)==')' && st.peek()==')'){
                    st.pop();
                }
                else if(str.charAt(i)==']' && st.peek()==']'){
                    st.pop();
                }
                else if(str.charAt(i)=='}' && st.peek()=='}'){
                    st.pop();
                }
            }
          
        }
        if(st.isEmpty()){
            System.out.println("Balanced paranthesis");
        }
        else{
            System.out.println("Unbalanced paranthesis");
        }
        System.out.println(st);
    }
}
