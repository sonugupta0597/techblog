/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyteTests;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class First {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      
           int n=scan.nextInt();
           int result=210;
           
           if((210+"").length()>n){
             System.out.println(-1);
           }
           else{
                 BigInteger l=BigInteger.valueOf(1);
                 
                 for(int j=1;j<n;j++){
                     l=l.multiply(BigInteger.TEN);
                 }
                 
                 BigInteger r=l.mod(BigInteger.valueOf(210));
                  if(r.compareTo(BigInteger.ZERO)==0){
                     r=l.divide(BigInteger.valueOf(210)).add(BigInteger.ONE);
                  }
                  else{
                    r=l.divide(BigInteger.valueOf(210));
                  }
                  System.out.println(r);
                  System.out.println(BigInteger.valueOf(210).multiply(r.add(BigInteger.ONE)));
           }
       
    }
}
