/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.recursion;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class GenerateallPairsof0and1 {

    public static void main(String args[]) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int ar[] = new int[2 * n];

        int value = 0;
        
        
        recursion(value, ar);
        
        System.out.println("");

    }

    private static void recursion(int value, int[] ar) {
        if (value == ar.length) {
            int count0 = 0;
            int count1 = 0;

            for (int j = 0; j < ar.length; j++) {
                if (ar[j] == 0) {
                    count0++;
                } else {
                    count1++;
                }
                if(count1>count0){
                     return;
                }
            }

            if (count0 <= count1) {
                for (int j = 0; j < ar.length; j++) {
                    System.out.print(ar[j]);
                }
                System.out.print(" ");

            }
        } else {
            for (int j = 0; j <= 1; j++) {
                ar[value] = j;
                recursion(value + 1, ar);
            }
        }
    }
}
