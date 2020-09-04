/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class EXAMCHT {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            int result=1;
            int n=Math.abs(a-b);
            int f=n;
            int d=2;
            int help=0;
            
            while(n>1){
                if(n%d==0){
                   help++;
                   n=n/d;
                }
                else{
                   d++;
                   if(help!=0)
                   result=result*(help+1);
                   help=0;
                }
            }
            if(result>0&&help>0){
            result=result*(help+1);
            }
            if(f!=0){
            System.out.println(result);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
