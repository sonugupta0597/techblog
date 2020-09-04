/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepbyte.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Pair implements Comparable<Pair>
{
    int lower;
    int upper;
    @Override
    public int compareTo(Pair o) {
        if(this.lower<o.lower){
                 return 1;
        }
        else if(this.lower>o.upper){
                 return -1;
        }
        else
            return 0;
    }

}
public class Pairs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        ArrayList<Pair> l=new ArrayList<Pair>();
        
        for(int j=0;j<m;j++){
            
                    Pair p=new Pair();
                    p.lower=scan.nextInt();
                    p.upper=scan.nextInt();
                    l.add(p);
              
        }
        
        Collections.sort(l);
        
        int flag=0;
        
        while(l.size()>2){
       
              Pair p1=l.remove(0);
              Pair p2=l.remove(1);
              if(p1.upper>=p2.lower){
                   Pair p=new Pair();
                   p.lower=Math.max(p1.lower,p2.lower);
                   p.upper=Math.min(p1.upper,p2.upper);
                   if(p.lower==p.upper)
                       flag++;
                   l.set(0, p);
              }
              else
              {
                   flag++;
              }
            
              System.out.println(l.size());
        }
        if(flag<2){
              System.out.println("YES");
        }
        else
        {
             System.out.println("NO");
        }
    }
}
