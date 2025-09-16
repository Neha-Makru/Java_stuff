import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = {1,34,56,9,2};
        int res = max(a);
        System.out.println(res);
    }
    static int max(int [] arr){
        int max_e = arr[0];
        for (int i =0; i<arr.length; i++){
            if (arr[i]>max_e){
                max_e = arr[i];
            }
        }
       return max_e; 
    }
}
