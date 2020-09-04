/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Foundation;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     
              int n=scan.nextInt();
              
              if(n<3){
                   System.out.println(-1);
              }
              else{
                   
                  if(n==3){
                       System.out.println(210);
                  }
                  else{
                      int v=1000;
                   for(int j=4;j<=n;j++){
                          int r=v%210;
                          v=210-r;
                          v=v*10;
                   }
                      System.out.print("1");
                      String u=""+v/10;
                   int i=0;
                   for( i=2;i<=n-u.length();i++){
                          System.out.print("0");
                   }
                      System.out.println(u);
                  }
              }
        
    }
}
