/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackwithFy;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class Second {
    public static long maxProfit(int[] cost,int[] l,int[] r){
        int ar[]=new int[cost.length];
        for(int i=0;i<l.length;i++){
                int a=l[i];
                int b=r[i];
                for(int j=a;j<=b;j++){
                        ar[j]++;
                }
        }
        Arrays.sort(ar);
        Arrays.sort(cost);
        long sum=0;
        for(int j=0;j<cost.length;j++){
              sum=sum+(ar[j]*cost[j]);
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] cost = new int[n];
        for(int j=0;j<n;j++){
            cost[j]=scan.nextInt();
        }
        int m;
        m=scan.nextInt();
        int[] l = new int[m];
        for(int j=0;j<m;j++){
            l[j]=scan.nextInt();
        }
        int[] r = new int[m];
        for(int j=0;j<m;j++){
            r[j]=scan.nextInt();
        }
        long result;
        result = maxProfit(cost,l,r);
        System.out.print(result);
        return ;
    }
}