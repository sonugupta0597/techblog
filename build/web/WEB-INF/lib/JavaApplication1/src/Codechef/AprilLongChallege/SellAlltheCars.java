/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef.AprilLongChallege;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class SellAlltheCars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
                  int n=scan.nextInt();
                  int ar[]=new int[n];
                  for(int j=0;j<n;j++){
                      ar[j]=scan.nextInt();
                  }
                  Arrays.sort(ar);
                  long sum=0;
                  int v=0;
                  for(int j=ar.length-1;j>=0;j--){
                         int a=ar[j]-v;
                         v++;
                         if(a>0){
                              sum=sum+a;
                         }
                  }
                  System.out.println(sum%1000000007);
        }
    }
}
