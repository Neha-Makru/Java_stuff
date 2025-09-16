import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {5,6,7,9},
                {10, 11}
        };

        for (int row=0; row< a.length; row++){
            for (int col =0; col< a[row].length;col++){
                System.out.print(a[row][col] +  " ");
            }
            System.out.println();
        }

    }
}
