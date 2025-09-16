import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 34, 56, 78};
        int flag = 0, ind = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you wish to find: ");
        int ele = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele) {
                ind = i;
                flag++;
                break;
            }
        }
        if (flag==1) System.out.println("Element found at location: "+ (ind + 1));
        else System.out.println("Element not found in the array. ");
    }
}


// using the functions

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 34, 56, 78};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you wish to find: ");
        int e = sc.nextInt();
        linSearch(a, e);
    }
    static void linSearch(int [] arr, int ele){
        int flag = 0, ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele) {
                ind = i;
                flag++;
                break;
            }
        }
        if (flag==1) System.out.println("Element found at location: "+ (ind + 1));
        else System.out.println("Element not found in the array. ");
    }
}
