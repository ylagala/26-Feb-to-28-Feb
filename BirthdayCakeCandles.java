package Arrays;

import java.util.Arrays;
import java.util.Scanner;
/*
 * sample input: 
 * 4
3 2 1 3
output: 2
*/
public class BirthdayCakeCandles {

	  static int birthdayCakeCandles(int n, int[] ar) {
	        
	        int count = 0;
	        Arrays.sort(ar);
	        int max = ar[n-1];
	        for(int i=0; i<n; i++){
	            
	                if(max == ar[i]){
	                    count++;
	                }
	            
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	    }

}
