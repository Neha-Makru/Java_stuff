import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number here: ");
        int n = sc.nextInt();
        int first = 1, second = 0, third=0;
        System.out.println(0);
        for (int i=1;i<=n;i++){
            third=first+second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }
}
