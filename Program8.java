//linear search
public class Program8{
    public static void main(String[] args){
        int num=3;
        int[] ar={2,4,5,3,6,0,1};
        int index=-1;
        
        for(int i=0; i<ar.length; i++){
            if(ar[i]==num){
                index=i;
                break;
            }
        }

        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("Found at index:"+index);
        }    

    }
}