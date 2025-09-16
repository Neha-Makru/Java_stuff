import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 34, 56, 78};
        reverse(a);
    }
        static void reverse(int [] ar){
            int start = 0;
            int end = ar.length - 1;

            while (start < end) {
                swap(ar, start, end);
                start++;
                end--;
            }
            System.out.println(Arrays.toString(ar));
        }
        static void swap(int[] arr, int ind_1, int ind_2){
            int temp = arr[ind_1];
            arr[ind_1] = arr[ind_2];
            arr[ind_2] = temp;

        }
    }
