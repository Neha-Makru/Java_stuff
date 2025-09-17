import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 19, 21};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you wish to find in the array: ");
        int t = sc.nextInt();
        Binsearch(a, t);
    }

    static void Binsearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, idx = 0;
        boolean found = false;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == target) {
                found = true;
                idx = mid;
                break;
            }

            if (arr[mid] < target) {
                low += 1;
            }
            if (arr[mid] > target) {
                high -= 1;
            }
        }
        if (!found) System.out.println("Element is not present in the array.");
        else System.out.println("Element present at the index: "+ idx);
    }
}
