import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        show(3, 5, "Neha", "Hello", "Monkey", "Money");
        show("Neha");
    }
    static void show(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void show(String name){
        String message = "Hello, " + name;
        System.out.println(message);
    }
}
