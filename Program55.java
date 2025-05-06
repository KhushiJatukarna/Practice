//print the maximum and minimum in the given array.
class Program55 {
    public static void main(String[] args) {
        int[] ar={6,5,4,2,3,9,1};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
            max=ar[i];
            }
            if(ar[i]<min){
            min=ar[i];
            }
        }
        System.out.println("maximum is "+max);
        System.out.println("minimum is "+min);      
    }
}

