/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleCodeJam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class Activity implements Comparable<Activity>
{
    int s;
    int e;
    int index;
    public Activity() {
    }
    
    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public Activity(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Activity o) {
        if(this.s<o.s){
             return -1;
        }
        else if(this.s>o.s){
             return 1;
        }
        else{
            return 0;
        }
    }
      
}
public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=0;i<t;i++){
                
                int n=scan.nextInt();
                ArrayList<Activity> l=new ArrayList<Activity>();
                char ch[]=new char[n];
                for(int j=0;j<n;j++){
                      Activity a=new Activity();
                      a.s=scan.nextInt();
                      a.e=scan.nextInt();
                      a.index=j;
                      l.add(a);
                      
                }
                
                Collections.sort(l);
                
                String s="";
                int a[]=new int[3];
                int b[]=new int[3];
                int flag=0;
                for(int j=0;j<l.size();j++){
                    Activity aa=l.get(j);
                          if(a[1]<=aa.s){
                                ch[aa.index]='J';
                                a[1]=aa.e;
                          }
                          else if(b[1]<=aa.s){
                                ch[aa.index]='C';
                                b[1]=aa.e;
                          }
                          else{
                              flag=1;
                              break;
                          }
                }
                
                
                System.out.print("Case #" + (i + 1) + ": ");
                if(flag==1)
                {
                       System.out.print("IMPOSSIBLE");
                }
                else
                {
                       for(int j=0;j<ch.length;j++){
                                 System.out.print(ch[j]);
                       }
                }
                System.out.println("");
        }
    }
}
