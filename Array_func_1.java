import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(a)); // {1,2,3,4,5} 
        change(a);
        System.out.println(Arrays.toString(a)); // {0, 2, 3, 4, 5} 
    }
    static void change(int [] nums){
        nums[0]= 0;
    }
}
