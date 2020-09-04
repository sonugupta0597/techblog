/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class SimpleOperations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
              String s=scan.next();
              String r=scan.next();
              long k=0;
              int l=0;
              int a=0;
              int b=0;
              int same=0;
              int different=0;
              for(int j=0;j<s.length();j++){
                  if(s.charAt(j)==r.charAt(j)){
                      same++;
                  }
                  else{
                      different++;
                  }
                  
                  if(same>different){
                       b=j;
                       if(different>0){
                       l=l+Math.abs(b-a);
                       k++;
                       
                       a=b;
                       same=0;
                       different=0;
                       }
                       
                  }
              }
              if(same>different){
                       b=s.length();
                       if(different>0){
                       l=l+Math.abs(b-a);
                       k++;
                       }
                       a=b;
                       same=0;
                       different=0;
                       
                  }
              System.out.println(k*l);
        }
    }
}
