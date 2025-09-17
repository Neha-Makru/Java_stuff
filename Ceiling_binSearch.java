import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;
        ceiling(a,target);
    }

    static void ceiling(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        if (target > arr[end]) {
            System.out.println("No ceiling found.");
            return;
        }
        while (start <= end) {
            int mid = (start + (end - start) / 2);  //3

            if (arr[mid]==target){
                System.out.println("Element is: " + arr[mid]);
                return;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                end-=1;
                }
            }
        System.out.println("The element is: "+ arr[start]);
        }
}
