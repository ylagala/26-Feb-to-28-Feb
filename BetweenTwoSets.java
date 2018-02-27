package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/*
 * Sample Input

2 3
2 4
16 32 96
Sample Output

3
*/

public class BetweenTwoSets {

	static int getTotalX(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);

		
		int totalCount = 0;

		for (int i = a[a.length - 1]; i <= b[0]; i++) {
			int count = 0;
			for (int j = 0; j < b.length; j++) {

				if ((b[j] % i) == 0) {
					count++;
				}
				
				if (count == b.length) {
					boolean flag = true;
					for (int k = 0; k < a.length; k++) {
						if (i % a[k] != 0) {
							flag = false;
							break;
						}
					}
					if (flag) {
						totalCount++;
					}
				}
			}
		}

		return totalCount;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int total = getTotalX(a, b);
		System.out.println(total);
		in.close();
	}

}
