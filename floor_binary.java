import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        floor(a, target);
    }

    static void floor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        if (target < arr[start]) {
            System.out.println("No floor value found.");
            return;
        }

        int floorValue = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("The floor is: " + arr[mid]);
                return;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                floorValue = arr[mid];
                start = mid + 1;
            }
        }
        System.out.println("The floor is: " + floorValue);
    }
}
