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
class BankManager {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              int n=scan.nextInt();
              int x=1;
              int count=0;
              for(int j=2;j<=Math.sqrt(n);j++){
                     if(n%j==0){
                        x=j;
                        count=j;
                        break;
                     }
              }
              int v=x;
              while(x<n){
                    if(n%x==0){
                        v=x;
                        x=x*2;
                        count=count+2;
                    }
                    else{
                        x=x+v;
                        count++;
                    }
              }
              System.out.println(count);
              
              
        }
    }
}
