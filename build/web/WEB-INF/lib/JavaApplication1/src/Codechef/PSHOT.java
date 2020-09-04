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
class PSHOT {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int no=scan.nextInt();
            String s=scan.next();
            int n=s.length();
            int a=0;
            int b=0;
            int aw=0;
            int bw=0;
            int flag=0;
            for(int j=0;j<n;j++){
                if(j%2==0){
                     a++;
                     if(s.charAt(j)=='1'){
                        aw++;
                     }
                     
                }
                else{
                      b++;
                      if(s.charAt(j)=='1'){
                        bw++;
                     }
                      
                }
                if(aw-bw>no-b){
                         System.out.println(j+1);
                         flag=1;
                         break;
                     }
                if(bw-aw>no-a){
                         System.out.println(j+1);
                         flag=1;
                         break;
                     }
            }
            if(flag==0){
                System.out.println(n);
            }
        }
    }
}
