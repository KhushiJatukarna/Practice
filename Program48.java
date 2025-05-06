//find max product subarray
public class Program48 {
    public static void main(String[] args) {
        int arr[] = { -2, 6, -3, -10, 0, 2 };
        int result = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            int mul = 1;
            for (int j = i+1; j < arr.length; j++) {
                mul *= arr[j];
                result = Math.max(result, mul);
                
            }
        }
        System.out.println(result);
    }
}
