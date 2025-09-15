import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        show(3, 5, "Neha", "Hello", "Monkey", "Money");
    }
    static void show(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
}
