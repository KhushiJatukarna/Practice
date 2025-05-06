import java.util.*;

public class Program49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter startDay");
        String startDay = sc.next(); 
        System.out.println("enter total no. of Day");
        int n = sc.nextInt(); 
        String[] days = {"sun", "mon", "tue", "wed", "thu", "fri", "sat"};
        int startIndex = -1;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(startDay)) {
                startIndex = i;
                break;
            }
        }
         if (startIndex == -1) {
            System.out.println("Invalid day entered. Please enter a valid day like sun, mon, etc.");
        } else {
            int count = 1;
            for (int i = 0; i < n; i++) {
                if ((startIndex + i) % 7 == 0) { 
                    count++;
                }
            }
            System.out.println("Number of Sundays: " + count);
        }
        sc.close();
    }
}

