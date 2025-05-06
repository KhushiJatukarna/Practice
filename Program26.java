//Perform right shift array by 2.
//input-{6,5,4,2,3,9,1}
//output-{2,3,9,1,6,5,4}
public class Program26 {
    public static void main(String[] args){
        int[] ar={6,5,4,2,3,9,1};
        int n=2;
        int[] temp = new int[ar.length];
        int index=0;
        for(int i=n+1;i<ar.length;i++){
            temp[index]=ar[i];
            index++;
        }
        for(int i=0;i<=n;i++){
            temp[index]=ar[i];
            index++;
        }
        for(int i=0;i<temp.length;i++){
        System.out.print(temp[i]+", ");
        }
 
    }
}
