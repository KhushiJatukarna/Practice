//input-- a2b3c4
//output-- aabbbcccc

class Program56 {
    public static void main(String[] args) {
        String str="a2b3c4";
        for(int i=0;i<str.length();i=i+2){
            char c=str.charAt(i);
            int w=str.charAt(i+1)-'0';
            for(int j=1;j<=w;j++){
                System.out.print(c);
            }
        }
    }
}


// class Program56 {
//     public static void main(String[] args) {
//         String str="a2b3c4";
//         String ans="";
//         for(int i=0;i<str.length();i=i+2){
//             ans=ans+String.valueOf(str.charAt(i)).repeat(str.charAt(i+1)-'0');
//         }
//         System.out.println(ans);
//     }
// }
    


