import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day number here: ");
        String day = sc.nextLine().toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("Weekday");
            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println("Invalid day entered");
        }
    }
}
