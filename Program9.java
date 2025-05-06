//linear search (modified version)
class Program9 {
    public static void main(String[] args) {

        int num=3;
        int[] ar={2,4,5,3,6,0,1};
        boolean found=false;
        
        for(int i=0, j=ar.length-1; i<=j; i++,j--){
             if(ar[i]==num || ar[j]==num){
               found=true;
               break;
            }
        }
        if(found==true){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }    

    }
}