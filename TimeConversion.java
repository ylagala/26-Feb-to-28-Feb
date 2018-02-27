package Arrays;

import java.util.Scanner;

public class TimeConversion {

static String timeConversion(String s) {
        
	  StringBuffer sb = new StringBuffer();
      if(s.endsWith("PM"))
      {
          if(s.startsWith("12"))
          {
              sb.append("12");
              sb.append(s.substring(2,s.length()-2));
          } else {
              int i = 12 + Integer.valueOf(s.substring(0,2));
              sb.append(i);
              sb.append(s.substring(2,s.length()-2));
          }
      }else{
          if(s.startsWith("12"))
          {
              sb.append("00");
              sb.append(s.substring(2,s.length()-2));
          } else
          {
      	   sb.append(s.substring(0,s.length()-2));
          }
      }
      return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }

}
