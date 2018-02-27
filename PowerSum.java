package Arrays;

import java.util.Scanner;


/*Sample Input 1

100
2
Sample Output 1
3
*/

public class PowerSum {

    static int powerSum(int X, int N,int i) {
        
        X = X - (int) Math.pow(i, N); // X = 10  n =2  i = 0 X  = 10 - (0) = 10
        if (X == 0) return 1;
        if (X > 0) {
            int sum = 0;
            for (int j = i + 1;  Math.pow(j, N) <= X;  j++)
                sum += powerSum(X, N, j);
            return sum;
        } else return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        int result = powerSum(X, N,0);
        System.out.println(result);
        in.close();
    }
}
