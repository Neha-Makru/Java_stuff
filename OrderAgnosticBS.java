import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 19, 21};
        int [] b= {21,19,10,8,7,3,2,1};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you wish to find in the array: ");
        int t = sc.nextInt();
        OABinsearch(b, t);
    }

    static void OABinsearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1, idx = 0;
        boolean found = false, order = arr[low] < arr[high];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                found = true;
                idx = mid;
                break;
            }

            if (order){
                if (arr[mid] < target) {
                    low = mid + 1;
                }
                else if (arr[mid] > target) {
                    high = mid - 1;
                }
            } else{
                if (arr[mid] > target) {
                    low = mid + 1;
                }
                else if (arr[mid] < target) {
                    high = mid - 1;
                }
            }

        }
        if (!found) System.out.println("Element is not present in the array.");
        else System.out.println("Element present at the index: "+ idx);
    }
}
