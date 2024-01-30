package From35;

import java.io.Console;

public class Task_35 {
    public static int searchInsert(int[] a, int target) {
        int left = -1;
        int right = a.length;

        while (right - left > 1) {
            int mid = left + ((right-left) >> 1 );
            if (a[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return right;
    }


    public static void main(String[] args){


        int result = searchInsert(new int[]{1,3,5,6}, 0);

        System.out.println(result);


    }
}
