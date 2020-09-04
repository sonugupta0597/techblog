/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class SquaredSubsequences {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              int ar[]=new int[n];
              int count=0;
              for(int j=0;j<n;j++){
                     ar[j]=scan.nextInt()%4;
              }
              int first2=n;
              int second2=n;
              for(int j=n-1;j>=0;j--){
                  int a=ar[j];
                  
                  if(a==2){
                       second2=first2;
                       first2=j;
                       count=count+n-second2;
                  }
                  
                  else if(a==0){
                       second2=j;
                       first2=j;
                       count=count+n-second2;
                  }
                  else
                  {
                       count=count+first2-j;
                       count=count+n-second2;
                  }
              }
              System.out.println(count);
              
        }
    }
}
