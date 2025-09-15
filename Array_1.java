// declaration and initialization of the arrays in Java 
// to note that the continuability of the elements of an array in the Java programming language depends upon the JVM 
/* 
How this happens: 
the stack and the heap memory are in the JVM and the elements stored in the array are stored in the heap memory and according to the 
JLS (Java Language specifications), there is no concrete proof that the elements within the heap memory may be stored in the contiguous memory locations 
so in Java, the elements in the array may or may not be present in the continuous locations, it is dependent on the JVM. 
*/ 

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[5]; //either you do this or
        int [] arr = {1,2,34,4,5,4,6};

        System.out.println(Arrays.toString(a)); //[0,0,0,0,0] not initialized yet
        System.out.println(Arrays.toString(arr)); // [1,2,34,4,5,4,6]
    }
}
