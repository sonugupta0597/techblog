/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph.newpackage;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class NearestCell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int ar[][] = new int[n][m];
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    ar[r][c] = scan.nextInt();
                }
            }
            int br[][] = new int[n][m];

            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    int value =Integer.MAX_VALUE;
                    for (int r1 = 0; r1 < n; r1++) {
                        for (int c1 = 0; c1 < m; c1++) {
                                if(ar[r1][c1]==1){
                                     int calc=Math.abs(r1-r)+Math.abs(c1-c);
                                     if(calc<=value){
                                          value=calc;
                                     }
                                }
                        }
                    }
                    br[r][c]=value;
                }
            }
            
            for (int r = 0; r < n; r++) {
                for (int c = 0; c < m; c++) {
                    System.out.print(br[r][c]+" ");
                }
            }
                System.out.println("");
        }
    }

}
