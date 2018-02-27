package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {
	  static int stringConstruction(String s) {
	        Set<Character> set = new HashSet<>();
	        char[] ch = s.toCharArray();
	        for(char c: ch)
	        {
	            set.add(c);
	        }
	        return set.size();
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            int result = stringConstruction(s);
	            System.out.println(result);
	        }
	        in.close();
	    }

}
