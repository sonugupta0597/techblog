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
class NobleVowel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               String s=scan.next();
               String ss="aeioun";
               int flag=0;
               for(int j=0;j<s.length();j++){
                        char ch=s.charAt(j);
                        if(ss.contains(ch+"")){
                              continue;
                          }
                        else{
                               if(j+1>=s.length()||!ss.contains(s.charAt(j+1)+"")){
                                     flag=1;
                               }
                               else{
                                         if(j+1<s.length()&&s.charAt(j+1)=='n'){
                                                  flag=1;
                                         }
                               }
                        }
               }
               
               if(flag==0){
                    System.out.println("YES");
               }
               else{
                    System.out.println("NO");
               }
        }
    }
}
