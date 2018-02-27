package Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		double length = arr.length;
		double positiveCount =0;
		double ZeroCount = 0 ;
		double NegativeCount = 0;
		for (int i = 0; i < length; i++) {
			if( arr[i] > 0){
			 positiveCount++;	
			}
			else if(arr[i] < 0){
				NegativeCount++;
			}
			else
			{
				ZeroCount++;
			}
		}
		BigDecimal bd = new BigDecimal(positiveCount/length);
		bd = bd.setScale((int) length, RoundingMode.HALF_UP);
		System.out.println(bd);
		
		BigDecimal bd1 = new BigDecimal(NegativeCount/length);
		bd1 = bd1.setScale((int) length, RoundingMode.HALF_UP);
		System.out.println(bd1);
		
		BigDecimal bd2 = new BigDecimal(ZeroCount/length);
		bd2 = bd2.setScale((int) length, RoundingMode.HALF_UP);
		System.out.println(bd2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
		in.close();
	}
}
