/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.String;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class AmanString {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               String s=scan.next();
               int count=0;
               for(int j=0;j<s.length();j++){
                    for(int k=j+3;k<s.length();k++){
                              if(s.substring(j,k+1).contains("aman")){
                                  count++;
                              }
                    }
               }
               System.out.println(count);
        }
    }
}
