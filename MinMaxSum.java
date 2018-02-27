package Arrays;

import java.util.Scanner;
import java.util.stream.IntStream;
 /*Sample Input

1 2 3 4 5
Sample Output

10 14*/
public class MinMaxSum {

	 static void miniMaxSum(int[] arr) {
		  long max = 0; 
		  long min = 0;
		  long sum = 0;
		  max = min =  sum = arr[0] ;
	        for(int i=1; i<arr.length; i++){
	        	if(arr[i] > max)
	        		max = arr[i];
	        	
	        	if(arr[i] < min)
	        		min = arr[i];
	        	
	        	sum = sum + arr[i];
	        		
	        	
	        }
	        System.out.println( (sum - max) + " " + (sum - min));
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[] arr = new int[5];
	        for(int arr_i = 0; arr_i < 5; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        miniMaxSum(arr);
	        in.close();
	    }
}
