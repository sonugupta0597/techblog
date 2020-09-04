/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class SLAB {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x= scan.nextInt();
            int k=scan.nextInt();
            int count=0;
            for(int j=2;j<=Math.sqrt(x);j++){
                   while(true){
                            if(x%j==0){
                                  x=x/j;
                                  count++;
                            }
                            else{
                                 break;
                            }
                   }
                   if(x==1){
                      break;
                   }
            }
            
            if(x!=1){
                 count++;
            }
            
            if(count>=k){
                    System.out.println(1);
            }
            else{
                    System.out.println(0);
            }
        }
    }
}
