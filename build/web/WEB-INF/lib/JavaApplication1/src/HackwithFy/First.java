/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackwithFy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class A implements Comparable<A>{
     int element;
     int count;

    @Override
    public int compareTo(A o) {
        if(this.count>o.count){
           return -1;
        }
        else if(this.count<o.count){
           return 1;
        }
        else{
               if(this.element>o.element){
                   return -1;
               }
               else if(this.element<o.element){
                   return 1;
               }
               else {
                   return 0;
               }
        }
    }
}
class First {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ar[]=new int[1001];
        for(int j=0;j<n;j++){
              ar[scan.nextInt()]++;
        }
        ArrayList<A> l=new ArrayList<A>();
        for(int j=1;j<1001;j++){
              if(ar[j]!=0){
                   A a=new A();
                   a.element=j;
                   a.count=ar[j];
                   l.add(a);
              }
        }
        
        Collections.sort(l);
        for(int j=0; j<l.size();j++){
             A a=l.get(j);
             System.out.print(a.element+" ");
        }
        System.out.println("");
    }
}
