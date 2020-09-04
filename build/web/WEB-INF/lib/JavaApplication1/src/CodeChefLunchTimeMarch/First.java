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
class First {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int a=scan.nextInt();
            int b=scan.nextInt();
            long sum=a+b;
            String s1=""+a;
            String s2=""+b;
            char ch1[]=s1.toCharArray();
            char ch2[]=s2.toCharArray();
            
            for(int j=0;j<ch1.length;j++){
                
                for(int k=0;k<ch2.length;k++){
                      char a1[]=ch1;
                      char a2[]=ch2;
                      char temp=a1[j];
                      a1[j]=a2[k];
                      a2[k]=temp;
                       s1="";
                       s2="";
                       for(int c=0;c<a1.length;c++){
                            s1=s1+a1[c];
                       }
                       
                       for(int c=0;c<a2.length;c++){
                            s2=s2+a2[c];
                       }
                       int u=Integer.parseInt(s1);
                       int v=Integer.parseInt(s2);
                       if(u+v>sum){
                          sum=u+v;
                       }
                      temp=a2[k];
                      a2[k]=a1[j];
                      a1[j]=temp;
                }
            }
            System.out.println(sum);
        }
    }
}
