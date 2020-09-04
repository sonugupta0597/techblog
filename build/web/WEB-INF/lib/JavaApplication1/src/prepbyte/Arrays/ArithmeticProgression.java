/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList l[]=new ArrayList[100001];
        for(int i=0;i<l.length;i++){
             l[i]=new ArrayList<Integer>();
        }
        for(int j=0;j<n;j++){
             l[scan.nextInt()].add(j);
        }
        int count=0;
        for(int j=0;j<l.length;j++){
             if(l[j].size()>0){
                     if(l[j].size()==1){
                            count++;
                     }
                     else{
                           int d=(int)l[j].get(1)-(int)l[j].get(0);
                           int flag=0;
                           for(int j1=2;j1<l[j].size();j1++){
                                      if((!((int)l[j].get(j1)-(int)l[j].get(j1-1)==d))){
                                            flag=1;
                                      }
                           }
                           if(flag==0){
                                 count++;
                           }
                     }
             }
        }
        System.out.println(count);
        for(int j=0;j<l.length;j++){
             if(l[j].size()>0){
                     if(l[j].size()==1){
                            System.out.println(j+" "+0);
                     }
                     else{
                           int d=(int)l[j].get(1)-(int)l[j].get(0);
                           int flag=0;
                           for(int j1=2;j1<l[j].size();j1++){
                                      if((!((int)l[j].get(j1)-(int)l[j].get(j1-1)==d))){
                                            flag=1;
                                      }
                           }
                           if(flag==0){
                                 System.out.println(j+" "+d);
                           }
                     }
             }
        }
        
    }
}
