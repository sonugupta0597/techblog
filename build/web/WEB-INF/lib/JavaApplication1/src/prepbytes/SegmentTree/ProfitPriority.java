/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class MaxProfits implements Comparable{
    int id;
    int deadLine;
    int profit;
    
    
    @Override
    public int compareTo(Object o) {
        MaxProfits m=(MaxProfits)o;
        if(this.profit> m.profit ){
           return -1;
        }
        else if(this.profit < m.profit){
             return 1;
        }
        else 
            return 0;
    }
}
class ProfitPriority {
    
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       ArrayList<MaxProfits> l=new ArrayList<MaxProfits>();
       for(int i=0;i<n;i++){
           MaxProfits mf=new MaxProfits();
           mf.id=scan.nextInt();
           mf.deadLine=scan.nextInt();
           mf.profit=scan.nextInt();
           l.add(mf);
       }
        Collections.sort(l);
        int ar[]=new int[n+1];
        for(int j=0;j<n;j++){
           MaxProfits mf=l.get(j);
           for(int k=Math.min(mf.deadLine,n);k>=1;k--){
               if(ar[k]==0){
                  ar[k]=mf.profit;
                  break;
               }
           }
        }
        long result=0;
        for(int j=1;j<=n;j++){
            result=result+ar[j];
        }
        System.out.println(result);
    }
        
}
