
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class AR {

    static int maxFactor(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return n / i;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        a = min;
        b = max;

        int count = 0;

        if (a == b) {
            System.out.print(0);
            return;
        } else {
            int minfact = 1;
            while (max != 1) {
                max = maxFactor(max);
                count++;
                if (min % max == 0) {
                    minfact = max;
                    break;
                }
            }

            while (min != minfact) {
                min = maxFactor(min);
                count++;
               
            }

        }
        
        System.out.print(count);
    }
}
