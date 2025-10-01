import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        char c = 'o';
        while (c!= 'x'){
            System.out.println("Enter the number here: ");
            int n = sc.nextInt();
            sum+=n;
            System.out.println("Do you wish to continue? (o/x): ");
            c = sc.next().charAt(0);
        }
        System.out.println("The sum till now has been: "+ sum);
    }
}
