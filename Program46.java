public class Program46 {
    public static void main(String[] args) {
        int[] arr1={2,1,3,4,8,4,5,1};
        int[] arr2={7,1,4};
        for(int i=0;i<arr2.length;i++){
            boolean flag=false;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println("Not a subset");
                return;
            }
        }
        System.out.println("subset");
    }
}
