/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class WealthyFather {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              int ar[]=new int[n];
              for(int j=0;j<n;j++){
                    ar[j]=scan.nextInt();
              }
              int l=scan.nextInt();
              int r=scan.nextInt();
              
              long lsum=0;
              for(int j=0;j<l;j++){
                   lsum=lsum+ar[j];
              }
              
              int index=0;
              int k=0;
              for(int j=l;j<n;j++){
                   long sum=lsum+ar[j]-ar[k++];
                   if(sum>lsum){
                       index=j-l;
                      lsum=sum;
                   }
              }
              
              long rsum=0;
              
              for(int j=0;j<r;j++){
                   rsum=rsum+ar[j];
              }
              
              for(int j=r;j<index;j++){
                   long sum=rsum+ar[j]-ar[l-j];
                   if(sum>rsum){
                      rsum=sum;
                   }
              }
              
              long rsum1=0;
              
              for(int j=index+l;j<index+l+r&&j<n;j++){
                   rsum1=rsum1+ar[j];
              }
              k=0;
              for(int j=index+l;j<n;j++){
                   long sum=rsum1+ar[j]-ar[k++];
                   if(sum>rsum1){
                      rsum1=sum;
                   }
              }
              
              if(rsum<rsum1){
                     rsum=rsum1;
              }
              
              System.out.println(lsum+rsum);
              
              
              
              
              
        }
    }
}
