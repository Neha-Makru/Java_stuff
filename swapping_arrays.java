import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = {1,34,56,9,2};
        System.out.println("Original array contains: "+ Arrays.toString(a));
        swap(a, 1,3);
        System.out.println("Swapped array contains: " + Arrays.toString(a));
    }
    static void swap(int [] arr, int ind_1, int ind_2){
        int temp = arr[ind_1];
        arr[ind_1] = arr[ind_2];
        arr[ind_2] = temp;
    }
}
