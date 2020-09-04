/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef.AprilLongChallege;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class StrangeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scan.nextInt();
            int k = scan.nextInt();

            if (k == 1) {
                if (x > 1) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(k==2){
                if (!isprime(x)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else{
                      if(x>k){
                          
                          if(Math.log(x)%Math.log(k)==0){
                                System.out.println(1);
                          }
                          else{
                                System.out.println(0);
                          }
                      }
                      else{
                             System.out.println(0);
                      }
            }
        }
    }

    private static boolean isprime(int x) {
        boolean b=true;
        for(int j=2;j<=Math.sqrt(x);j++){
                   if(x%j==0){
                         b=false;
                         break;
                   }
        }
        return b;
    }

    private static int factors(int x) {
        int count=0;
        for(int j=2;j<=x;j++){
                   if(x%j==0){
                         count++;
                   }
        }
        return count;
    }
}
