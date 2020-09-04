/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef.AprilLongChallege;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class COVIDPandemicandLongQueue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int ar[] = new int[n];
            for (int j = 0; j < n; j++) {
                ar[j] = scan.nextInt();
            }
            int diff = 0;
            int count = 0;
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (count == 0 && ar[j] == 1) {
                    count++;
                    diff = j;
                } else {
                    if (ar[j] == 1) {
                        diff = j - diff;
                        if (diff < 6) {
                            flag = 1;
                            break;
                        }
                        diff=j;
                    }
                }
            }
            if (flag == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            }
        }
    }
