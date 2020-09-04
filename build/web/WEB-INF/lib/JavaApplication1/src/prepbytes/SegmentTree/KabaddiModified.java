/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.Scanner;

/**
 *
 * @author pc
 */
class KabaddiModified {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             String s=scan.next();
             int k=scan.nextInt();
             int countIndex=0;
             
             char ch[]=s.toCharArray();
             for(int j=0;j<s.length();j++){
                   if(ch[j]=='1'){
                        countIndex++;
                   }
             }
             int ar[]=new int[countIndex];
             
             int index=0;
             for(int j=0;j<s.length();j++){
                   if(ch[j]=='1'){
                        ar[index++]=j;
                   }
             }
             int count=0;
             for(int j=0;j<ar.length;j++){
                 int flag=0;
                 int d=-1;
                   for(int k1=ar[j];k1>=Math.max(0,ar[j]-k);k1--){
                           if(ch[k1]!='1'){
                               d=k1;
                              flag=1;
                              
                           }
                   }
                   if(flag==1){
                        count++;
                        ch[d]='1';
                   }
                   if(flag==0){
                        for(int k1=ar[j];k1<=Math.min(s.length()-1,ar[j]+k);k1++){
                           if(ch[k1]!='1'){
                               count++;
                              ch[k1]='1';
                              break;
                           }
                   }
                   
                   }
             }
             System.out.println(count);
        }
    }
}
