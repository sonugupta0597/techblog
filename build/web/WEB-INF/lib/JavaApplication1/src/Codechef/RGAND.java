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
class RGAND {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
               int l=scan.nextInt();
               int r=scan.nextInt();
               long sum=l;
               int result=l;
               for(int j=l+1;j<=r;j++){
                   result=result&j;
                   sum=sum+result;
                   if(result==0){
                      break;
                   }
               }
               System.out.println(sum%(1000000007));
        }
    }
}
