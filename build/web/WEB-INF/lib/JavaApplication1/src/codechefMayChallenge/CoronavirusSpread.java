/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefMayChallenge;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class CoronavirusSpread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int n=scan.nextInt();
            int ar[]=new int[n];
            for(int j=0;j<n;j++)
            {
                ar[j]=scan.nextInt();
            }
            
            int min=Integer.MAX_VALUE;
            
            int max=Integer.MIN_VALUE;
            
            for(int j=0;j<n;j++)
            {
                 int a=ar[j];
                 
                 int count=1;
                 
                 for(int k=j-1;k>=0;k--){
                      if(a-ar[k]<=2){
                           count++;
                           a=ar[k];
                      }
                 }
                 
                 a=ar[j];
                 
                 
                 for(int k=j+1;k<n;k++){
                      if(ar[k]-a<=2){
                           count++;
                           a=ar[k];
                      }
                 }
                 
                 if(min>count){
                    min=count;
                 }
                 
                 if(max<count){
                    max=count;
                 }
            }
            
            System.out.println(min+" "+max);
        }
    }
}
