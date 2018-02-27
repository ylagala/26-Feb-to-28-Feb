package Arrays;

import java.util.Scanner;


/*
 * 
 * Sample Input

2
12
1012
Sample Output

2
3
*/
public class FindDigits {

	  static int findDigits(int n) {
	        String s = String.valueOf(n);
	        int len = s.length();
	        int count = 0;
	        for(int i=0; i<len; i++){
	            int div = Integer.parseInt(s.substring(i, i+1));
	            if(div !=0 ){
	        	if( n % div == 0){
	        		count++;
	        	}
	            }
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int result = findDigits(n);
	            System.out.println(result);
	        }
	        in.close();
	    }
}
