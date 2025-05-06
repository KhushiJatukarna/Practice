//WAP to check first letter to appear twice
//input--"abccbaacz"
//output--"c"
public class Program50 {
    public static void main(String[] args) {
        String str="abccbaacz";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}



