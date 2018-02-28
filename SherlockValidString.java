package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockValidString {

	static String isValid(String s) {
	
		String result ="";
		int count =0;
		Map<Character, Integer> map = new HashMap<Character, Integer>(); 
		  char[] chars = s.toCharArray();

		    for(Character ch:chars){
		      if(map.containsKey(ch)){
		         map.put(ch, map.get(ch)+1);
		      } else {
		         map.put(ch, 1);
		      }
		    }

		    Set<Character> set = map.keySet();
		   for(Character ch:set){
		    	  if(map.get(ch) == 1){
		    	    System.out.println(ch+" ");
		    	    count++;
		    	    
		    	  }
		    	}
		    
		    if(count == 1){
		    	result = "YES";
		    }else{
		    	result ="NO" ;
		    }
		    return result;
	}

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = isValid(s);
	        System.out.println(result);
	    }

}
