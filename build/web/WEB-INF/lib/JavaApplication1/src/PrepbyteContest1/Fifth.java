/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrepbyteContest1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Fifth {
    static long result=Integer.MAX_VALUE;
    static int flag1=0;
    static int flag2=0;
    static int flag3=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             long m=scan.nextLong();
             long ar[]=new long[3];
             
             for(int j=0;j<3;j++){
                     ar[j]=scan.nextLong();
             }
              
             result=Integer.MAX_VALUE;
             long r=4-m%4;
             long sum=m%4;
             long cost=0;
             recursion(r,ar,sum,cost);
             System.out.println(result);
        }
        
        
    }

    private static void recursion(long r, long[] ar,long sum , long cost) {
        
        if(sum%4==0){
                if(cost<result){
                      result=cost;
                }
        }
        else{
                 for(int j=0;j<3;j++){
                        if(j==0){
                            sum=sum+1;
                            cost=cost+ar[0];
                            flag1++;
                        }
                        if(j==1&&r!=1){
                            sum=sum+2;
                            cost=cost+ar[1];
                            flag2++;
                        }
                        if(j==2){
                           sum=sum+3;
                           cost=cost+ar[2];
                           flag3++;
                        }
                        recursion(r,ar,sum,cost);
                 }
        }
    }
}
