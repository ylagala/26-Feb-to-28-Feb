package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeftRotation {

	public static void main(String[] args) {
		int[] i = {1 , 2 , 3 , 4};
		int len = i.length;
		int leftRotate = 1 ;
		
		int rightRotate = 1 ;
		int[] i1 = {1 , 2 , 3 , 4};
		int len1 = i1.length;
			
		List<Integer> list = new ArrayList<>();
		list = Arrays.stream(i).boxed().collect(Collectors.toList());	
		Collections.rotate(list, rightRotate);
		System.out.println(list);
		
		
		List<Integer> list1 = new ArrayList<>();
		list1 = Arrays.stream(i1).boxed().collect(Collectors.toList());
		Collections.rotate(list1, len-leftRotate);
		System.out.println(list1);
		
		//convert arraylist to array 
		int[] j = list.stream().mapToInt(n -> n).toArray();
		Arrays.stream(j).forEach(System.out::println);
		
		
		
		

	}

}
