import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] a = {-90, 304, -8970};
        int c = 0;
        for (int x = 0; x < a.length; x++) {
            int res = countDig(a[x]);
            if (res % 2 == 0) {
                c++;
            }
        }
        System.out.println(c);
    }

    static int countDig(int num){
        if (num<0) num*=-1;
        if (num==0) return 1;

        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
