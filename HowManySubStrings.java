package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HowManySubStrings {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int q = in.nextInt();
	        String s = in.next();
	        for(int a0 = 0; a0 < q; a0++){
	            int left = in.nextInt();
	            int right = in.nextInt();
	            if( ((right +1 )-left) <= 1){
	                System.out.println("1");
	            }else{
	            
	            String str ="";
	            if( right == (n-1)){
	            	str = s.substring(left);
	            }
	            else
	            {
	            	str = s.substring(left,right+1);
	            }
	            int count = 0;
	            int strLen = str.length();
	            Set<String> set = new HashSet<>();
	            for(int i=0; i<strLen; i++){
	                for(int j=i+1; j<=strLen; j++){
	                   set.add(str.substring(i,j));
	                   System.out.println("substring value**"+str.substring(i,j));
	                }
	            }
	            System.out.println(set.size());
	            set.clear();
	            }
	        }
	    }

}
