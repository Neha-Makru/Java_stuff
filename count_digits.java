import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int n = sc.nextInt();
        System.out.println("Enter the number you wish to find the count of: ");
        int e = sc.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == e)
                count += 1;
            n /= 10;
        }
        System.out.println(count);
    }
}
