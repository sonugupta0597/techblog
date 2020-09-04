/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeChefLunchTimeMarch;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class Second {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            String s=scan.next();
            int k=scan.nextInt();
            int x=scan.nextInt();
            int ch[]=new int[26];
            int count=0;
            for(int j=0;j<s.length();j++){
                int a=s.charAt(j)-97;
                ch[a]++;
                if(ch[a]<=x){
                   count++;
                }
                else{
                    if(k==0){
                     break;
                }
                   k--;
                }
                
            }
            System.out.println(count);
        }
    }
}
