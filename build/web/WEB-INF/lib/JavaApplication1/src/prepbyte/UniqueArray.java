/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class UniqueArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
             int n=scan.nextInt();
             int ar[]=new int[n];
             for(int j=0;j<n;j++){
                     ar[j]=scan.nextInt();
             }
             int index[]=new int[n];
             ArrayList<Integer> l1=new ArrayList<Integer>();
             int maxlength=0;
             for(int j=0;j<n;j++){
                   if(!l1.contains(j)){
                             
                             int a=j;
                             ArrayList<Integer> l2=new ArrayList<Integer>();
                             while(!l2.contains(ar[a])){
                                    
                                    
                                    if(!l1.contains(a)){
                                       l1.add(a);
                                    }
                                    l2.add(ar[a]);
                                    a=ar[a];
                             }
                             if(l2.size()>maxlength){
                                    maxlength=l2.size();
                             }
                   }
             }
             System.out.println(maxlength);
        }
    }
}
