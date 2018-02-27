package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMedian {


    static int findMedian(int[] arr) {
        int index = arr.length ;
        index = index /2;
        Arrays.sort(arr);
        int retVal = arr[index];
        return retVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = findMedian(arr);
        System.out.println(result);
        in.close();
    }
}
