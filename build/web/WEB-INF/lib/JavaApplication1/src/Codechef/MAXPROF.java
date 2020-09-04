/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codechef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */


class MAXPROF {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
            int n=scan.nextInt();
            int wieght=scan.nextInt();
            int x=scan.nextInt();
            int y=scan.nextInt();
            
            int w[]=new int[n];
            int value[]=new int[n];
            
            for(int j=0;j<n;j++){
                 w[j]=scan.nextInt();
            }
            for(int j=0;j<n;j++){
                 value[j]=scan.nextInt();
            }
            long result=0;
            int index=0;
            ArrayList<Integer> a=new ArrayList<Integer>();
        
                  result=recursion(a,w,value ,wieght,x,y,index);
                  System.out.println(result);
            
        }
    }

    private static long recursion(ArrayList<Integer> a, int[] w, int[] value,int wieght,int x,int y,int inde) {
        int sum=0;
        if(inde>=value.length||wieght-w[inde]<0){
                               int max=0;
               int secondMax=0;
               int index=-1;
               for(int j=0;j<a.size();j++){
                   if(a.get(j)>=max){
                      max=a.get(j);
                      index=j;
                   }
                 
               }
               int secondIndex=-1;
               for(int j=0;j<a.size();j++){
                   if(a.get(j)>=secondMax && j!=index){
                      secondMax=a.get(j);
                      secondIndex=j;
                   }
                 
               }
               for(int j=0;j<a.size();j++){
                   if(j==index){
                      sum=sum+a.get(j)*Math.max(x,y);
                   }
                   else if(j==secondIndex){
                        sum=sum+a.get(j)*Math.min(x,y);
                   }
                   else
                   sum=sum+a.get(j);
               }
                    return sum;
        }
        int aa=inde;
        inde++;
        long left=recursion(a,w,value ,wieght,x,y,inde);
       
        a.add(value[aa]);
        
        long right=recursion(a,w,value ,wieght-w[aa],x,y,inde);
        
        a.remove(a.size()-1);
        
        return Math.max(left,right);
    }
}
