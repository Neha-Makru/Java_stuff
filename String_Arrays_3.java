import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] names = new String [3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< names.length; i++) {
            System.out.print("Enter the "+ (i + 1) + " position element here: ");
            names[i] = sc.next();
        }
        System.out.println("Array elements have been stored. ");

        System.out.println("Printing the array elements now... ");
        System.out.println(Arrays.toString(names));
    }
}
