import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 1, max = Integer.MIN_VALUE;
        while (check!=0){
            System.out.print("Enter the number here: ");
            int x = sc.nextInt();
            if (x>max){
                max = x;
            }
            System.out.println("Do you wish to continue? (0/1): ");
            check = sc.nextInt();
        }
        System.out.print(max);
    }
}
