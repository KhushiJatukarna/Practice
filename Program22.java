//Input-My name is Khushi Sharma.
//Output-ym eman si ihsuhk amrahs
public class Program22 {
    public static void main(String[] args){
        String str="My name is Khushi Sharma.";
        str=str.toLowerCase();
        str=str.replace(".","");
        String[] strArray=str.split(" ");
        for(int i=0;i<strArray.length;i++){
            String temp=strArray[i];
            for(int j=temp.length()-1;j>=0;j--){
                System.out.print(temp.charAt(j));             
            }
            System.out.print(" ");
        }
    }
}
