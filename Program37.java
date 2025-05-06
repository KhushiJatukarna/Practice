//Each integer is denoted as arr[i] (0<=i<=n)
//predict the kth smallest positive integer that is not found within array.
//Note:The smallest positive integer is 1.
//n=5   arr=[1,4,7,3,4]   k=5
class Program37{
    public static void main(String[] args){
        int arr[]={1,4,7,3,4};
        int k=5;
        int num=1;
        int count=0;
        while(count<k){
            boolean flag=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }

    }
}