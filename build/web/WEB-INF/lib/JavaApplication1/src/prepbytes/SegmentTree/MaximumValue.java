/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbytes.SegmentTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */

class MaxProfit implements Comparable{
    int value;
    int weight;

    @Override
    public int compareTo(Object o) {
        MaxProfit m=(MaxProfit)o;
        if(this.value/this.weight> m.value/m.weight ){
           return -1;
        }
        else if(this.value/this.weight < m.value/m.weight){
             return 1;
        }
        else 
            return 0;
    }
}
class MaximumValue {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int w=scan.nextInt();
        ArrayList<MaxProfit>l=new ArrayList<MaxProfit>();
        for(int j=0;j<n;j++){
            MaxProfit mf=new MaxProfit();
            mf.value=scan.nextInt();
            mf.weight=scan.nextInt();
            l.add(mf);
        }
        
        Collections.sort(l);
        long result=0;
        for(int j=0;j<n;j++){
            MaxProfit mf=l.get(j);
            if(mf.weight<=w){
               result=result+mf.value;
               w=w-mf.weight;
            }
            else{
               result=result+(int)Math.ceil(mf.value * ((float)w/mf.weight));
               break;
            }
            
        }
        System.out.println(result);
        
    }
}
