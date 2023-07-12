package arrays;

import java.util.Arrays;

public class ArraysSample {

    public static void main(String[] args) {

        int[] array = {2,3,1,6,8,7,9,4};
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted array is: ");
        for (int num : array) {
            System.out.println(num + " ");
        }
    }
}
