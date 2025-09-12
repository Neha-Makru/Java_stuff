import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers la: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = add(a,b);
        System.out.println(res);
    }
    static int add(int a, int b){
        return a+b;
    }
}
