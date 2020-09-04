/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Test {
    public static void main(String[] args) {
        Queue<Integer>q1=new ArrayDeque<Integer>();
        q1.
        Scanner scan=new Scanner(System.in);
        int ar[]=new int[2000001];
        for(int i=2;i<Math.sqrt(2000001);i++){
            
            if(ar[i]!=1){
               
                for(int j=i+1;j<ar.length;j++){
                        if(ar[j]!=1){
                               if(j%i==0)
                                   ar[j]=1;
                        }
                }
            }
        }
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
                int n=scan.nextInt();
                int br[]=new int[n];
                for(int r=0;r<n;r++){
                    br[r]=scan.nextInt();
                }
                int count=0;
                for(int r=0;r<n;r++){
                    for(int c=r+1;c<n;c++){
                           if(ar[br[r]+br[c]]==0){
                                  count++;
                           }
                    }
                }
                System.out.println(count);
        }
    }
}
