package apiClass.arrays;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};

        // 1st way - Most common
        int[][] arr2 = Arrays.copyOf(arr1, arr1.length);

        // Check array's address
        System.out.println(arr1.equals(arr2));

        // Check the 1st row's value
        // If it's different address value => false
        System.out.println(Arrays.equals(arr1, arr2));

        // Check all the values
        // Even though the address value is different at 1st row
        // , if the value same, then it's true
        System.out.println(Arrays.deepEquals(arr1, arr2));
    }
}
