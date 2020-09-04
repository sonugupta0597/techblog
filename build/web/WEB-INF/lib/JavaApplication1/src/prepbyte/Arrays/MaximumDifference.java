/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Arrays;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class MaximumDifference {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              int ar[]=new int[n];
              int minValue=Integer.MAX_VALUE;
              int minIndex=-1;
              int maxValue=Integer.MIN_VALUE;
              int maxIndex=-1;
              for(int j=0;j<n;j++){
                  ar[j]=scan.nextInt();
                  if(ar[j]>=maxValue){
                     maxValue=ar[j];
                     maxIndex=j;
                  }
                  if(minValue>ar[j]){
                     minValue=ar[j];
                     minIndex=j;
                  }
              }
              System.out.println(Math.abs(maxValue-minValue)+Math.abs(minIndex-maxIndex));
        }
    }
}
