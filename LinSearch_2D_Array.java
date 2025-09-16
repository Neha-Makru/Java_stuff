import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("Enter the element you wish to find: ");
        int ele = sc.nextInt();
        int [] res = search(a, ele);
        System.out.println(Arrays.toString(res));
    }

    static int [] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (target == arr[row][col])
                    return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};
    }
}
