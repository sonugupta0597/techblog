/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class DedicateLength {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             int w=scan.nextInt();
             int n=scan.nextInt();
             int m=scan.nextInt();
             int result=Integer.MAX_VALUE;
             int a=0;
             int b=0;
             int v=0;
             while(Math.min(n,m)*v<=w){
                   int r=(w-(Math.min(n,m)*v))%Math.max(n,m);
                   if(r<result){
                       result=r;
                       a=v;
                       b=(w-(Math.min(n,m)*v))/Math.max(n,m);
                   }
                   v++;
                   
             }
             if(m>=n){
                 System.out.println(a+" "+b);
             }
             else{
                 System.out.println(b+" "+a);
             }
        }
    }
}
