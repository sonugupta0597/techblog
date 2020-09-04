/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.recursion;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class SumofSequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             int n=scan.nextInt();
             long sum=0;
             recursion(n,sum);
        }
    }

    private static void recursion(int n, long sum) {
        if(n==1){
             sum=sum+1;
             System.out.println(sum%1000000007);
             return;
        }
        else{
             sum=sum+n;
             if(n%2==0){
                  recursion(n/2,sum);
             }
             else{
                 n=3*n+1;
                 recursion(n,sum);
             }
        }
    }
}
