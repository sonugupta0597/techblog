/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class XORGM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int ar[] = new int[n];
            int br[] = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = scan.nextInt();
            }

            for (int j = 0; j < n; j++) {
                br[j] = scan.nextInt();
            }
            int help[] = new int[n];
            int result[] = new int[n];
            int a = 0;
            int b = 0;
            int flag = 0;
            for (int j = 0; j < n; j++) {
                a = a ^ ar[j];
                b = b ^ br[j];
            }
            int r = a ^ b;
            for (int j = 0; j < n; j++) {
                help[j] = r ^ ar[j];
                result[j] = r ^ ar[j];
            }
            Arrays.sort(help);
            Arrays.sort(br);
            for (int j = 0; j < n; j++) {
                if (help[j] != br[j]) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[j]+" ");
                }
            }
            else
                System.out.print(-1);
            System.out.println("");
        }
    }
}
