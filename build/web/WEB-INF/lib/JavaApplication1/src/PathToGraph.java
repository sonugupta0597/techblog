
import java.util.Scanner;

public class PathToGraph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
            
        }
        
        if (x != y) {
            int mf = 1;
            int c = 0;
            while (x != 1) {

              
                x = maxF(x);
                
                c++;
                if (y % x == 0) {
                    mf = x;
                    break;
                }
            }

            while (y != mf) {
                c++;
                y = maxF(y);
                

            }

            System.out.print(c);

        } else {

            System.out.print(0);
            return;

        }

    }

    private static int maxF(int value) {
        int rslt=1;
        for (int i = 2; i <value; i++) {
            
            if (value % i == 0) {
               
                rslt = i;
            }
        }
        
        return rslt;
    }
}
