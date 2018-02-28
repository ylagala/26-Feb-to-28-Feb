package Arrays;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StrongPassword {
	  static int minimumNumber(int n, String password) {
		  int count = 0;
		  Pattern p = Pattern.compile("([a-z])");
		  Pattern p1 = Pattern.compile("([A-Z])");
		  Pattern p2 = Pattern.compile("\\d");
		  Pattern p3 = Pattern.compile("\\W");
	        if(! p.matcher(password).find())
	        		{
	        	password = password +"a";
	        	count++;
	        }
	        if(! p1.matcher(password).find())
    		   {
	        	password = password +"A";
	        	count++;
               }
	        if(! p2.matcher(password).find())
 		   {
	        	password = password +"1";
	        	count++;
            }
	        if(! p3.matcher(password).find())
 		   {
	        	password = password +"@";
	        	count++;
            }
	        
	        if(password.length() < 6 ){
	        	count = count + 6 - password.length() ;
	        
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String password = in.next();
	        int answer = minimumNumber(n, password);
	        System.out.println(answer);
	        in.close();
	    }
}
