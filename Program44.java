//find the second largest and second smallest element in a array
public class Program44 {
    public static void main(String[] args) {
        int[] ar={0,6,5,4,2,3,9,1};
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                secMax=max;
                max=ar[i];
            }
            else if (ar[i] > secMax && ar[i] != max) {
                secMax = ar[i];
            }
            if(ar[i]<min){
                secMin=min;
                min=ar[i];
            }
            else if (ar[i] < secMin && ar[i] != min) {
                secMin = ar[i];
            }
        }
        System.out.println("maximum is "+max);
        System.out.println("Second maximum is "+secMax);
        
        System.out.println("minimum is "+min);  
        System.out.println("Second minimum is "+secMin);
    }
}
