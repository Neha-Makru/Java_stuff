import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< a.length; i++) {
            System.out.print("Enter the "+ (i + 1) + " position element here: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements have been stored. ");

        System.out.println("Printing the array elements now... ");

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
