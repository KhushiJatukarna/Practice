//create multiple objects of a class and the count should increse once new objects are created.
public class Main {
    static int count;
    Main(){
        count++;
    }
    public static void main(String[] args){
        Main m1= new Main();
        Main m2= new Main();
        Main m3= new Main();
        Main m4= new Main();
        System.out.println(count);
    }
}
