import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year here: ");
        int year = sc.nextInt();
        if (year %4 ==0 && year%100!=0 || year%400==0){
            System.out.println("This is a leap year that you have entered.");
        }
        else
            System.out.println("This is not a leap year.");
    }
}
