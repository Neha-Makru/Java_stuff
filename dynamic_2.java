import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>(5);
        System.out.println("Enter the marks of the five subjects here: ");
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            marks.add(x);
        }
        System.out.println("Printing the elements now.. Method 1");
        System.out.println(marks);

        System.out.println("Printing the marks using the second method now ");
        for (int j = 0; j < 5; j++) {
            System.out.print(marks.get(j)+ " ");
        }
        System.out.println();
    }
}
