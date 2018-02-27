package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClosestNumber {

	static int[] closestNumbers(int[] arr) {

		int temp = Integer.MAX_VALUE;
		Arrays.sort(arr);
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i <arr.length - 1; i++) {
			int diff = Math.abs(arr[i] - arr[i + 1]);
			if (temp > diff && diff > 0) {
				temp = diff;
				list.clear();
				list.add(arr[i]);
				list.add(arr[i + 1]);
			} else if (diff == temp) {
				list.add(arr[i]);
				list.add(arr[i + 1]);
			}

		}
		Collections.sort(list);
		System.out.println(list);
		return list.stream().mapToInt(i -> i).toArray();

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		int[] result = closestNumbers(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

		in.close();
	}
}
