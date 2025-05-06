//binary search in string array.
public class Program12 {
    public static int binarySearch(String ar[],String key) {
        int beg=0;
        int end=ar.length-1;
        while(beg<=end){
            int mid=(beg+end)/2;
            int comparison = ar[mid].compareTo(key);
            if (comparison == 0) {
                return mid;  
            } else if (comparison > 0) {
                end = mid - 1; 
            } else {
                beg = mid + 1; 
            }
        }
        return -1;
    }
    public static void main(String ar[]){
        String fruits[]={"Apple", "Banana", "Fig", "Guavava", "Grapes", "Kiwi", "MAngo", "Orange"};
        String key="Kiwi";
        int index=binarySearch(fruits,key);
        if(index==-1)
        System.out.println("Not Found");
        else
        System.out.println("Found at index: "+index);


    }
}
