//input--Today is Monday 
//output--yadnoM si yadoT

class Program31 {
    public static void main(String[] args) {
        String str="Today is Monday";
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            String temp=arr[i];
            for(int j=temp.length()-1;j>=0;j--){
                System.out.print(temp.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
