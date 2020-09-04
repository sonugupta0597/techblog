/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class BecomeKing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
           int n=scan.nextInt();
           long ar[]=new long[n];
           for(int j=0;j<n;j++){
                ar[j]=scan.nextLong();
           }
           Arrays.sort(ar);
           long result=0;
           for(int j=1;j<n;j++){
                ar[j]=ar[j]+ar[j-1];
                result=result+ar[j];
           }
            System.out.println(result);
        }
    }
}
