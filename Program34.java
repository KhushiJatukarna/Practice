//Program to find all lonely numbers in the array.
//input--[10,6,5,8,2,4]
//output--[10,8,2]
class Program34{
    public static void main(String ar[]){
        int[] arr={10,6,5,8,2,4};
        for(int i=0; i<arr.length; i++){
            boolean lonely=true;
            for(int j=0; j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j] || arr[i]-1==arr[j] || arr[i]+1==arr[j]){
                        lonely=false;
                        break;
                    }
                }
            }
            if(lonely){
                System.out.print(arr[i]+" ");
            }
        }
    }
}