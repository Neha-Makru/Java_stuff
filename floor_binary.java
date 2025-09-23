import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 9, 14, 16, 18};
        int target = 7;
        int res = floor(a, target);
        System.out.println("The floor value is: " + res);
    }
    static int floor(int [] arr, int target){
        int start = 0, end = arr.length-1;
        while (start <= end){
            int mid = (start + (end - start)/2);

            if (arr[mid]== target){
                return arr[mid];
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else end = mid -1;
        }
        return end;
    }
}
