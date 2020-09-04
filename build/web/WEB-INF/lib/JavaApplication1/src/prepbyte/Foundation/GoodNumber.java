/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Foundation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class GoodNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
       
        for (int i = 0; i < t; i++) {
            long n = scan.nextLong();
            
            long v=n;
            ArrayList<Long> l = new ArrayList<Long>();
            int flag=0;
            while (n >= 3) {
                long r = (long)(Math.log(n)/Math.log(3));
                n = n-(long)Math.pow(3,r);
                while (l.contains(r)) {
                    flag=1;
                    r++;
                }
                l.add(r);
                 if(flag==1){
                   break;
                }
            }
            
            if(flag==0){
            if (n == 1) {
                long r=0;
                l.add(r);
                
            }
            
            if (n == 2) {
                
                long r=1;
                while (l.contains(r)) {
                    r++;
                }
                l.add(r);
             
            }
            }
            Collections.sort(l);
            
            long sum=0;
            for(int j=l.size()-1;j>=0;j--){
                   if(sum>=v){
                       break;
                   }
                   sum=sum+(long)Math.pow(3,l.get(j));
            }
            System.out.println(sum);
        
        
    }
}
}
