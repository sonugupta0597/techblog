/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechefMayChallenge;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class IsolationCenters {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int t=scan.nextInt();
        
        for(int i=0;i<t;i++){
        
            int n=scan.nextInt();
            int c=scan.nextInt();
            
            int ar[]=new int[26];
            
            String s=scan.next();
            
            for(int j=0;j<n;j++){
                      ar[s.charAt(j)-97]++;
            }
            
            ArrayList<Integer> l =new ArrayList<Integer>();
            
            for(int k=0;k<26;k++){
                      if(ar[k]>0){
                         l.add(ar[k]);
                      }
                }
            
            for(int j=0;j<c;j++){
            
                int q=scan.nextInt();
                
                int count=0;
                
                for(int k=0;k<l.size();k++){
                
                    if(l.get(k)>q){
                        
                        count=count+l.get(k)-q;
                        
                    }
                    
                }
                
                
                System.out.println(count);
            }
        }
    }
}
