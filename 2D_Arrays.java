import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {3, 4, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
